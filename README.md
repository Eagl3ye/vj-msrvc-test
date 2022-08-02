# microservices
Using H2 In-memory Database

### Accounts
Port: 8080

POST: localhost:8080/myAccount
  - In Postman as JSON:
  > { "customerId": 1 }

POST:  localhost:8080/myCustomerDetails
  - In Postman as JSON:
  > { "customerId": 1 }

GET:   localhost:8080/account/properties

### Loans
Port: 8090

POST:  localhost:8090/myLoans
  - In Postman as JSON:
  > { "customerId": 1 }

GET:   localhost:8090/loans/properties

### Cards
Port: 9000

POST:  localhost:9000/myCards
  - In Postman as JSON:
  > { "customerId": 1 }

GET:  /cards/properties

