Feature: Project creation

  Background:
    Given Open Contextual Semantic AI and login

  Scenario: Create a new project in a root folder
    Given User clicks on the New project button
    When Inserts unique project name
    And Confirms project creation
    Then New project is created successfully
    And New project is opened in the Project tree
    And New project is opened in the Breadcrumbs
    And New project is opened in the Segments Breakdown table