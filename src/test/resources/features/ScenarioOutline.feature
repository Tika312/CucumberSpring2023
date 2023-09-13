Feature: Scenario Outline example


  @outline
 Scenario Outline: Create new user
   Given enter first name "<firstName>"
   And enter last name "<lastName>"
   And enter email "<email>"
   Examples:
     | firstName | lastName | email           |
     |  John     | Doe      | john@gmail.com  |
     |   James   | Bond     | bond@gmail.com  |
     |  Leo      | Messi    | Lmessi@gmail.com|