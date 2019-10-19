Feature: Agendar cita
  como usuario de KevSura quiero agendar una cita en la plataforma

  Scenario: agendar exitoso
    Given que kevin se encuentra en la plataforma de KevSura
    When el se dirige a la pantalla de asignar citas y asigna una cita disponible
    Then el debera ver que la cita se agendo correctamente