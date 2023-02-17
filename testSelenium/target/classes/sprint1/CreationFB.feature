@TN1
Feature: Creation FB
	Nous allons creer un compte Facebook
	
  @tag1
  Scenario: Creation compte FB
    Given Ouvrir le navigateur 
    And Ouvrir URL
    And Cliquer sur creer compte
    When Saisir nom
    And Saisir prenom
    And Saisir mail
    And Saisir mailConfirm
    And Saisir password
    And Saisir date de naissance
    And Selectionner le genre
    And Cliquer sur inscription
    Then compte creer