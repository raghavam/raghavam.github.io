---
layout: page
title: Projects
share: false
---

### Large Scale Computing

* #### Distributed OWL Reasoning
    
    1. DistEL  
       * Distributed OWL EL reasoner 
       * Axioms are distributed based on their type across a cluster of machines.  
       * Barrier synchronization is used for termination detection.
       * Load balancing is achieved at run time using work stealing. This piece of work was done during the summer internship at IBM Research, Dublin, Ireland.    
       * Implementation is in Java and Redis is the distributed key-value store.
       * Code available at <a href="https://github.com/raghavam/DistEL" target="_blank">https://github.com/raghavam/DistEL<a/>   
&nbsp;
    2. DQuEL  
       * Distributed queue based implementation of OWL EL reasoning.  
       * Each concept in the ontology is assigned a queue and these queues are spread over the cluster.
       * Implementation is in Java and Redis is the distributed key-value store.
       * Code available at <a href="https://github.com/raghavam/DQuEL" target="_blank">https://github.com/raghavam/DQuEL<a/>   
&nbsp;  
    3. MR-EL  
       * A MapReduce implementation of OWL EL reasoning.  
       * Axioms are represented as key-value pairs.  
       * Each rule is a MapReduce job and these are run iteratively.
       * An additional MapReduce job is needed for termination detection.     
&nbsp;
    4. Shared Memory Reasoning
       * OWL EL reasoning on a massively parallel shared-memory Cray XMT supercomputer. 
       * This work was done during the summer internship at Complexible Inc (formerly known as Clark & Parsia), Boston MA.
       * Axioms are represented as a directed labeled graph.     
       * This reduces the reasoning task to finding the transitive closure of the graph.   
       * Implementation is in C++ using the macros supported by Cray XMT.   

* #### Scalable RDF Query Processing

    * Developed DSparq, a distributed and scalable RDF query engine.  
    * This work was started during the summer internship at Alcatel-Lucent Bell Labs, Dublin, Ireland.  
    * RDF graph is vertex partitioned across the nodes in the cluster.
    * Given SPARQL query is analyzed to find triple patterns that can be run in parallel. 
    * Implemented in Java using MongoDB and Hadoop.
    * Code available at <a href="https://github.com/raghavam/d-sparq" target="_blank">https://github.com/raghavam/d-sparq<a/>      



### Semantic Web Applications   

   1. Temporal Consistency Checking in Marketing Workflows
      * This work was done during the summer internship at Xerox Research Center, Webster, NY.
      * Events in a workflow involve temporal relationships and time constraints.
      * Temporal inconsistencies could be present in such workflows.
      * Temporal model was developed in OWL and James Allen's temporal operators are implemented as SWRL rules. 
      * Rules are run against the data in the knowledge base. Pellet is used to detect inconsistencies.   
      * Explanations (justifications) for the inconsistencies can be generated.   
&nbsp;
 
   2. Situational Understanding from Social data
      * This work was done during the summer internship at IBM T.J. Watson Research Center, NY in collaboration with UIUC, SMU, AFRL and ARL.  
      * Goal is to develop a framework that can obtain situational awareness of events from social data such as Twitter and Instagram images.
      * I built an ontology for *Protest* data based on tweets, Wikipedia and news articles. 
      * I developed REST API on top of the ontology to facilitate reasoning and answer questions related to concepts and relationships in the ontology.    
&nbsp;

   3. T.cruzi Semantic PSE 
      * Goal of the project is to develop an ontology-driven semantic problem solving environment (PSE) for parasite (Trypanosoma cruzi) data. 
      * It allows integration of local and public data to answer biology queries.
      * I was involved in the ontology driven translation of data from relational database and excel sheets to RDF.
      * My work involved usage of tools such as D2RQ and Jena.     
&nbsp;

   4. Twitris
      * Tweets are analyzed along spatial, temporal and thematic dimensions. 
      * Events are extracted from tweets, which are in turn used to get related information from other data sources such as news, images and videos.   
      * I was involved in the implementation of algorithms for tweet analysis and in the development of SQL queries.   
 