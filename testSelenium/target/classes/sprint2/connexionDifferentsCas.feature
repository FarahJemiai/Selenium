@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: connexion
    Given ouvrir browser chrome
    And ouvrir application orange
    When saisir mail adresse<mail>
    And entrer pwd<MDP>
    And cliquer sur le bouton
    Then connect

    Examples: 
      | mail   | MDP      |
      | Admin  | admin123 |
      | Admin0 | 1234*    |
      | Admin  |     5648 |
      | azerty | admin123 |
