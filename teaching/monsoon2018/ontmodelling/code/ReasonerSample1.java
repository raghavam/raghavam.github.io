package edu.iiitd.ontchatbot;

import java.io.File;
import java.util.stream.Stream;

import org.semanticweb.HermiT.Configuration;
import org.semanticweb.HermiT.Reasoner;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

public class ReasonerSample1 {
	
	private final String baseIRI = 
			"http://www.iiitd.ac.in/monsoon2018/om/cookingrecipe/";
	private OWLOntology ontology;
	private OWLOntologyManager manager;
	private OWLReasoner reasoner;
	private OWLDataFactory dataFactory;
	
	private void loadOntologyReasoner(String ontFilePath) {
		File ontFile = new File(ontFilePath);
		manager = OWLManager.createOWLOntologyManager();
		try {
			ontology = manager.loadOntologyFromOntologyDocument(IRI.create(ontFile));
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
		Configuration configuration = new Configuration();
		reasoner = new Reasoner(configuration, ontology);
		dataFactory = manager.getOWLDataFactory();
	}
	
	public void checkClassSubsumption(String ontFilePath) {
		loadOntologyReasoner(ontFilePath);	
		OWLClass oc = dataFactory.getOWLClass(IRI.create(baseIRI + "KeralaCuisine"));
		Stream<OWLClass> superClasses = reasoner.getSuperClasses(oc).entities();
		superClasses.forEach(cl -> System.out.println(cl.getIRI().getFragment()));
	}
	
	public void checkInstanceMembership(String ontFilePath) {
		loadOntologyReasoner(ontFilePath);
		OWLNamedIndividual namedIndividual = 
				dataFactory.getOWLNamedIndividual(IRI.create(baseIRI + "biryani"));
		Stream<OWLClass> instanceTypes = reasoner.getTypes(namedIndividual).entities();
		instanceTypes.forEach(cl -> System.out.println(cl.getIRI().getFragment()));
	}
	
	public static void main(String[] args) {
		String ontFilePath = "src/main/resources/cookingrecipe.owl";
		ReasonerSample1 intelligentChatbot = new ReasonerSample1();		
		intelligentChatbot.checkClassSubsumption(ontFilePath);
//		intelligentChatbot.checkInstanceMembership(ontFilePath);
	}
}
