Feature: Client login

  Scenario: cliente se logea correctamente
    Given cliente quiere logearse
    When el ingresa username y password
    Then el visualiza el menu principal
