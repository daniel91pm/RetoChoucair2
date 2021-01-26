# Autor: XXXXXXXXX
@stories
Feature:  retoChoucair2
  As a user, I  need to join to Utest page to learn and improve the automation skills

  @scenario1
  Scenario: Fill the Register
    Given than daniel Open Utest Page and try to Click Join Button

    When he Fill and complete all register fields
      | strName | strLastName | strEmail                    | strBirthDay | strBirthMonth | strBirthYear | strCity | strPostalCode | strPassword   |
      | Daniel  | Perez       | daniel-japones1@hotmail.com | 3           | September     | 1991         | Medell  | 055420        | 123Daniel987. |

    Then he finds button complete Register

