Feature: To retrieve the balance with account details

  Scenario: retrieve the account balance with account id
    When the client calls GET "/getAccountBalance/{accountId}/currency/{currency}" with accountId as "BNP0002" and currency as "AUD"
    Then the client receives status code of 200
    And the response contains amount "100"
    
  Scenario: retrieve empty balance with account id
    When the client calls GET "/getAccountBalance/{accountId}/currency/{currency}" with accountId as "BNP0005" and currency as "AUD"
    Then the client receives status code of 204
			