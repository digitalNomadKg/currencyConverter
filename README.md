# Currency exchange API 1.0.0 OAS3

The Currency exchange API supports the simple currency exchange converter.

The currency exchange server the basic functionality of API includes creating a currency converter with given currency codes,
updating the currency codes, getting all currencies and deleting currency by ID from the database.
Currency exchange converter API provides only a REST interface. There is no user interface.
The service can be used and tested via API testing tools (e.g., SoapUI, Postman).
Solution of the task was done according to OpenAPI documentation.

_Technical choices_

    1) Spring Boot version 2.5.5
    2) Spring Data JPA
    3) Gradle
    4) Lombok
    5) PostGresSql
    6) Swagger version 2.9.2
    7) API testing tool Postman
    8) Docker
    9) Docker Gradle Plugin

_Deployment instructions:_

    1) PostGresSql database:(localhost:5432/converter)
    login: postgres
    password: root123
    
    2) No authentification
    3) Transport API provides only a REST interface, no user interface
    4) Application is running on localhost: server: 8081 
    5) Swagger UI : http://localhost:8081/swagger-ui.html

_API offers the following resource collections:_

    Currency - represents the physical currency entity.
 
_Manage Currency:_

    Create currency.
    Get all currencies.
    Update currency.
    Delete currency with given ID.

_Things to be done:_

    1) Dockerfile
    2) Basic Spring Security Authentification

