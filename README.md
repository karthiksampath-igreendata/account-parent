# account-parent

The services are designed based on the microservice pattern CQRS(Command and Query Responsibility Segregation), where a separate service will be created for read operations and another service for create, update and delete operations. 

#account-query

Swagger Url : http://localhost:5002/account-query/swagger-ui/index.html#/

Based on the requirement query service have 2 api's, first one to get the list of accounts and the other one to get the transaction summary based on the account Id.

#account-command

Swagger Url : http://localhost:5001/account-command/swagger-ui/index.html#/

Command service created with limited scope to create account and transactions with placeholders to do autorization and validation if required.

#account-framework

Created with Common Exceptions and Logger configurations.


