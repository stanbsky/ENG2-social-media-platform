workspace "Deployment" "Description" {

    model {
        u = person "User"
        adm = person "Administrator"
        s = softwareSystem "Deployment" {
            cli = container "CLI Client"
            
            vm = container "Video Microservice" {
                domain_vm = component "Domain objects and DTOs"
                ctrls_vm = component "Controllers"
                repos_vm = component "Repositories"
                events_vm = component "Kafka producers"
                kbeans_vm = component "Kafka data objects"
            }
            
            thm = container "Trending Hashtag Microservice" {
                ctrls_thm = component "Controller"
                dtos_thm = component "DTOs"
                streams_thm = component "Kafka Streams processor"
                iqs_thm = component "Interactive Query Service"
            }
            
            sm = container "Subscription Microservice" {
                domain_sm = component "Domain objects and DTOs"
                ctrls_sm = component "Controller"
                repos_sm = component "Repositories"
                events_sm = component "Kafka producers"
                kbeans_sm = component "Kafka data objects"
                streams_sm = component "Kafka Streams processor"
                iqs_sm = component "Interactive Query Service"
                consumer_sm = component "Kafka consumer"domain
            }
            
            database = container "Database" "" "MariaDB" "database"
            kafka = container "Kafka Cluster"
            kafkaui = container "Kafka-UI Webapp" "" "" webapp
            ideadbui = container "IntelliJ IDEA DB tab" "" "" webapp
        }
        
        u -> cli "Uses"
        adm -> kafkaui "Manages"
        adm -> ideadbui "Uses"
        
        cli -> vm "Interacts with HTTP API"
        cli -> sm "Interacts with HTTP API"
        cli -> thm "Interacts with HTTP API"
        
        vm -> database "Reads and writes to"
        vm -> kafka "Consumes and produces events"
        
        kafkaui -> kafka "Manages"
        ideadbui -> database "Manages"
        
        repos_sm -> domain_sm "Creates and updates"
        repos_sm -> database "Queries and writes in"
        ctrls_sm -> domain_sm "Uses for API requests"
        ctrls_sm -> repos_sm "Uses"
        ctrls_sm -> events_sm "Publishes"
        ctrls_sm -> iqs_sm "Queries"
        streams_sm -> iqs_sm "Populates"
        streams_sm -> kafka "Consumes events"
        streams_sm -> kbeans_sm "Uses for serialization"
        events_sm -> kafka "Consumes and produces events in"
        consumer_sm -> kafka "Consumes events"
        consumer_sm -> events_sm "Produces events in"
        consumer_sm -> kbeans_sm "Uses for serialization"
        events_sm -> kbeans_sm "Uses for serialization"
        
        repos_vm -> domain_vm "Creates and updates"
        repos_vm -> database "Queries and writes in"
        ctrls_vm -> domain_vm "Uses for API requests"
        ctrls_vm -> repos_vm "Uses"
        ctrls_vm -> events_vm "Publishes"
        events_vm -> kafka "Consumes and produces events in"
        events_vm -> kbeans_vm "Uses for serialization"
        
        ctrls_thm -> iqs_thm "Queries"
        streams_thm -> iqs_thm "Populates"
        streams_thm -> kafka "Consumes events"
        ctrls_thm -> dtos_thm "Creates and updates"
    }
    
    views {
        theme default
        systemContext s {
            include *
        }
        container s {
            include *
        }
        component vm {
            include *
        }
        component thm {
            include *
        }
        component sm {
            include *
        }
        styles {
            element "database" {
                shape Cylinder
            }
            element "webapp" {
                shape WebBrowser
            }
        }
    }

    configuration {
        scope softwaresystem
    }

}
