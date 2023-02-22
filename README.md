# account-parent

The services are designed based on the microservice pattern CQRS(Command and Query Responsibility Segregation). Command service for create, update & delete operations and query service for read operations.

#account-query

Swagger Url : http://localhost:5002/account-query/swagger-ui/index.html#/

As per the requirement, query service have 2 api's, one to get the list of accounts and the other to get the transaction summary based on the account Id. DataLoader service has been included to load test data on service start-up in case of embedded db, otherwise MySQL can be used (command service will load data in mysql in this case).

#account-command

Swagger Url : http://localhost:5001/account-command/swagger-ui/index.html#/

Command service created with limited scope to create account and transactions with placeholders to do autorization and validation if required. This can used to ingest data if MySQL DB is used for testing

#account-framework

Created with required domain files, exceptions and logger configurations.

#database

1. By Default spring boot embedded database will used and account & transanctions are populated during service start-up for testing. Start the services without any profile.
2. To use MySQL as DB:
		-- Create and Insert scripts are located in account-framework\src\main\resources\scripts\sql.
		-- Update mysql db details in application-mysql.properties		
		-- Create tables and insert data before using the api's or enable this property "spring.jpa.hibernate.ddl-auto=update "in application-mysql properties to auto create tables.
		-- Start the service with profile 'mysql'




