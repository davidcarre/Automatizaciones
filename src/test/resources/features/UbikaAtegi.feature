Feature: Acceso a Ubika

  Como usuario de Ubika
  Quiero acceder a la plataforma
  Para poder interactuar con sus funcionalidades

  Scenario: Ingreso exitoso a Ubika
    Given I navigate to the login page
    When I enter the email and password
    And I click login
    And I navigate to the tender creation page
    Then I should see the tender creation page
