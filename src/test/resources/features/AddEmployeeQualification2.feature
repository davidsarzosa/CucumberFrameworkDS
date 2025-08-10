
Feature: Admin Add employee Qualifications

  Background:
    Given User is logged into the application
    When User navigates to PIM and clicks on Employee List
    And User clicks on any employee in the list 
    Then User should be navigated to the Personal Details page
    When the admin expands the More dropdown
    And selects the Qualifications option
    Then the Qualifications page should be displayed

  @work_experience
  Scenario: Add Work Experience to employee
    When the admin clicks on the + icon
    And selects Work Experience
    Then the Work Experience modal should be displayed
    When the admin fills in valid work experience details and clicks Save
    Then the new work experience should appear in the Work Experience table

  @education
  Scenario: Add Education to employee
    When the admin clicks on the + icon
    And selects Education
    Then the Add Education modal should be displayed
    When the admin fills in valid education details and clicks Save
    Then the new education entry should appear in the Education table

  @skill
  Scenario: Add Skill to employee
    When the admin clicks on the + icon
    And selects Skill
    Then the Add Skill modal should be displayed
    When the admin fills in valid skill details and clicks Save
    Then the new skill should appear in the Skills table

  @language
  Scenario: Add Language to employee
    When the admin clicks on the + icon
    And selects Language
    Then the Add Language modal should be displayed
    When the admin fills in valid language details and clicks Save
    Then the new language should appear in the Languages table

  @license
  Scenario: Add License to employee
    When the admin clicks on the + icon
    And selects License
    Then the Add License modal should be displayed
    When the admin fills in valid license details and clicks Save
    Then the new license should appear in the License table