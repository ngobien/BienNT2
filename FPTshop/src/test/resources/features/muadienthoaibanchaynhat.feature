@tag
Feature: fptshop

  @tag1
  Scenario: Mua hang ban chay tren fpt shop
    Given I staying homepage
    When I do mouse move menu tablet
    And I do select first on page product list 
    And I do buy now
    Then I should see product on shop card


