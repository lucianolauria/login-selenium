@Suite @Login
Feature: Login

  Background: Validar el inicio de sesion con credenciales validas

    Given el usuario ingresa al sitio web

    @ValidCredentials
    Scenario: 1 - Validar con credenciales correctas
      When ingresa credenciales validas
      Then la aplicacion muestra el Home