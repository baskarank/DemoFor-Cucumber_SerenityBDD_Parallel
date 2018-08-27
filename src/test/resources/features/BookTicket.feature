Feature: Booking Ticket

  Background: 
    Given I launched the mercury tours
    When I enter the "baskarankk" and "baskarankk"
    Then I should be navigate into Flight details page

  Scenario Outline: Booking one way
    Given I selected the trip type as "<trip_type>"
    And I give the passenger count as "<count>"
    And I select the departure as "<from>"
    And the from date selected as "<on_Month>" and "<on_date>"
    And I select the Arrival as "<to>"
    And the to date selected as "<ret_Month>" and "<ret_date>"
    And the prefered class as "<class_type>" and the airline as "<airline_name>"
    When I click the continue button
    Then I should see the select Flight page

    Examples: 
      | trip_type | count | from   | on_Month | on_date | to    | ret_Month | ret_date | class_type | airline_name     |
      | one way   |     2 | London | March    |      20 | Paris | April     |       10 | First      | Unified Airlines |
