# Random Address Generator

## Get Started

### Overview
The service allows to generate random access for USA, Canada, Mexico, and Netherdlands.

#### Use cases for the service include:
* An internal client running a delivery bill payment service that wants to periodically verify consumers' existing address for shipping mails.

* An internal client running a customer service that wants to update a consumer address.

## API Reference
### RandomAddressGeneratorAPI
Random Address Generator allows to generate a random address.

### Endpoint:
GET /randomizer/address

### Response Reference
| Parameter           |      Type      |  Example                  |
|---------------------|:--------------:|---------------------------|
| Address             |  Object        | See child attributes      |
| Address.house       |  String        | 432                       |
| Address.street      |  String        | Hamilton St., Apt 87      |
| Address.postalCode  |  String        | 74321                     |
| Address.city        |  String        | San Diego                 |
| Address.county      |  String        | Hartford                  |
| Address.state       |  String        | Kentucky                  |
| Address.stateCode   |  String        | KY                        |
| Address.country     |  String        | United States of America  |
| Address.countryCode |  String        | USA                       |
