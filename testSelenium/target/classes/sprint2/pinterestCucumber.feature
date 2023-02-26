@TN2
Feature: Creation d un compte pinterest
  Nous allons creer un compte sur pinterest

  @tag2
  Scenario: compte pinterest
    Given ouvrir le navigateur google chrome
    And acceder a l URL du site pinterest
    And cliquer sur s inscrire
    When saisir adresse email
    And saisir le mot de passe
    And saisir age
    And cliquer sur continuer
    And cliquer sur suivant
    Then page d accueil
