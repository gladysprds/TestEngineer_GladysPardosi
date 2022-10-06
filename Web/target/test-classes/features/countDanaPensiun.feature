Feature: Pension Fund
  As a user
   i want to count pension fund
    so that i can get my pension fund for my future

  Scenario: As a user i have to be able to count my pension fund
    Given I am on homepage
    When I scroll down and choose Dana Pensiun
    And I click next button
    And I fill field Penghasilan and field Tingkat Inflasi and click next button
    And I fill field Usia and field Usia pensiun and click next button
    And I fill the ratio and click next button
    Then I get my result




