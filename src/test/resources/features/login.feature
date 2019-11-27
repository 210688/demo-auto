Feature: Login User

  Scenario: Login user
    Then Click "Log In" button
    Then Input email
    Then Input password
    Then Click "Log In" button span
    Then Content with "Book On Demand 1-on-1 Video Meetings with Instructors **" visible