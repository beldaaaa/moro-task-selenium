Feature: Google search scenarios

  @P1
  Scenario: Search for MoroSystems and visit the career page

    Given I am on Google website
    When I type 'MoroSystems' into the Google search bar
    And  I click on MoroSystems website
    Then I navigate to 'Kariéra' section