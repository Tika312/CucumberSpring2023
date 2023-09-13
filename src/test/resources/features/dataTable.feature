Feature: Data Table example

  @Table
  Scenario: Registration functionality
    Given user is on registration page
    And fill up the form with following data
    |john Doe|Leo Messi|Lebron James|
    |CR7     | Benzema | Kante      |
    |Tony    |Oscar    |Ali         |
    |Denis   |Mane  c   |Salah       |