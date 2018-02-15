
@tag
Feature: Hotel Booking in Delta Page



  @tag1
  Scenario: Booking Hotel Based on the filter
    
    Given I am in delta page
    When I select hotel booking module in book a trip module
    And I enter the input for booking hotel
   
  @tag2
  Scenario: Selecting Hotel Based on the amenities
  
  When  I filter hotel based on star rating
  And   I filter hotel based on food availability
  And   I filter hotel based on Pool availability
  