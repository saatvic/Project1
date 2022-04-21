@API
Feature: Testing Book Store API

  Background: User generates token for Authorisation
    Given I am an authorised user

  Scenario: Authorised user is able to add or remove a book
    Given A list of books are available
    When I add a book to my reading list
    Then The book is added
    When I remove a book from my reading list
    Then The book is removed
