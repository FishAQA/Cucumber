Feature: Project creation

  Scenario: Create a new project in a root folder
    Given User clicks on the New project button
    When Inserts unique project name
    And Confirms project creation
    Then New project is created successfully
    And New project is opened in the Project tree
    And New project is opened in the Breadcrumbs next to the Home icon
    And New project is opened in the Segments Breakdown table

  Scenario: Create a new project in a subfolder

    Given A subproject exists in the root folder
    When User clicks on the New project button
    And Inserts unique project name
    And Selects the subproject
    And Confirms project creation
    Then New project is created successfully
    And New project is opened in the Project tree
    And New project is opened in the Breadcrumbs next to the parent project
    And New project is opened in the Segments Breakdown table