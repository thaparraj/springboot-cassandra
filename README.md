Spring Boot integration with Cassandra
======================================

# Description
This project uses spring data for cassandra module. It uses a very simple model - CustomerAccount object. It has  
two endpoints - one to add a new account, another to get the account.

# How to install and run
1. you will need a cassandra server.  
Either download Cassandra from https://cassandra.apache.org/doc/latest/cassandra/getting_started/installing.html
I used version: 4.1.2.  
Or  
Use an existing installation and set properties in application.properties file.
2. create a keyspace and table, I used following cqlsh commands:  
   create keyspace CustomerProfileKeyspace with replication={'class':'SimpleStrategy', 'replication_factor':1};  
   use Custo[test](src%2Ftest)merProfileKeyspace;  

   CREATE TABLE CustomerAccount (  
     externalCustomerId text PRIMARY KEY,  
     firstName text,  
     lastName text  
     );
# How to use
1. run program using any IDE. I used IntelliJ.
2. add an account:
   curl --location 'http://localhost:8080/Accounts' --header 'Content-Type: application/json' --data '{"firstName" : "John","lastName" : "Doe"}'  
3. get an account:
   curl --location 'http://localhost:8080/Accounts/<id> : id is externalCustomerId from prev output
# Watchout
1. The CqlSession bean needed to be configured to specify keyspace name
2. table name had to be lowercase in model