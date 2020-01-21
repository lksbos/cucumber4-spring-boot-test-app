Feature: Products Api

  Scenario: As an external application I want to search a product by type
    Given I have the product with id "1" and type "COMMODITY" in my database
    When I hit the endpoint "/products?type=COMMODITY"
    Then The server returns the product with the following data
      | id | name                 | type      |
      | 1  | My COMMODITY product | COMMODITY |

  Scenario: As an external application I want to receive appropriate error message when searching a product with invalid type
    When I hit the endpoint "/products?type=INVALID"
    Then The server returns status code 400 and an error message like "No enum constant com.example.cucumber.model.Type.INVALID"