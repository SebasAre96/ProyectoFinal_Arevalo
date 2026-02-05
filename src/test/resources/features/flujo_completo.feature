Feature: Flujo completo en OrangeHRM

  Scenario: Login exitoso
    Given el usuario accede a OrangeHRM
    When realiza login
    Then visualiza el dashboard

  Scenario: Buscar empleado
    Given el usuario accede a OrangeHRM
    And realiza login
    When navega al modulo PIM
    And busca el empleado "John"
    Then se muestran resultados

  Scenario: Flujo completo E2E
    Given el usuario accede a OrangeHRM
    When realiza login
    And navega al modulo PIM
    And busca el empleado "John"
    And cierra sesion
    Then vuelve a la pagina de login