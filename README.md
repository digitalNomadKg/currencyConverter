# Currency exchange API 1.0.0 OAS3

The Currency exchange API supports the simple currency exchange converter.

The currency exchange server the basic functionality of API includes creating a currency converter with given currency codes,
updating the currency codes, getting all currencies and deleting currency by ID from the database.
Currency exchange converter API provides only a REST interface. There is no user interface.
The service can be used and tested via API testing tools (e.g., SoapUI, Postman).
Solution of the task was done according to OpenAPI documentation.

__Technical choices__

    1) Spring Boot version 2.2.6
    2) Spring Data JPA
    3) Gradle
    4) Lombok
    5) PostGresSql
    6) Swagger version 2.9.2
    7) API testing tool Postman
    8) Docker
    9) Docker Gradle Plugin

__Deployment instructions:__

    1) PostGresSql database:(localhost:5432/converter)
      - login: postgres
      - password: root123
    
    2) Basic authentification
      - login: admin
      - password:root123

    3) Transport API provides only a REST interface, no user interface
    4) Application is running on localhost: server: 8081 
    5) Swagger UI : http://localhost:8081/swagger-ui.html

__API offers the following resource collections:__

    Currency - represents the physical currency entity.
 
__Manage Currency:__

    1) Create currency.
    2) Get all currencies.
    3) Update currency.
    4) Delete currency with given ID.

__Things to be done:__

    1) Dockerfile
    2) Basic UI
