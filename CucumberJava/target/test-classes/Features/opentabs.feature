Feature: Feature to test Amazon Home Page

  @tag1
  Scenario: Open mutiple tabs under Help div
    Given I am on the HomePage of Amazon
    When I open all tabs under Let us Help You banner
    And navigate to middle tab
    Then title of the tab should be "a"
