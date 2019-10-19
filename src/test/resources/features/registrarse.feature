Feature: Registrarse
  como usuario sin eps necesito registrarme a la EPS KevSura

  Scenario: registrarse exitoso
    Given que kevin se encuentra en la plataforma de KevSura
    When el llena todos los campos y se registra en la platafoma
    Then el debera verse registrado correctamente