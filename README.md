# microservices
Using H2 In-memory Database

### Accounts
Port: 8080

POST: /myAccount
  - In Postman:
  > {
  >   "customerId": 1
  > {
POST: /myCustomerDetails
  - In Postman:
  > {
  >   "customerId": 1
  > {
GET:  /account/properties

### Loans
Port: 8090

POST: /myLoans
  - In Postman:
  > {
  >   "customerId": 1
  > {
GET:  /loans/properties

### Cards
Port: 9000

POST: /myCards
  - In Postman:
  > {
  >   "customerId": 1
  > {
GET:  /cards/properties

