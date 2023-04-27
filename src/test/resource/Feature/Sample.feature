Feature: Iam doing automation of Add skills in OrangeHRM.


Background: Common Steps

Given launch chrome browser
Then Open application URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario Outline: Creating Skills Record

Given User enters Username as "Admin" and Password as "admin123"
Then  go to Skills Page
When create Skill record as Skill Name as <Skill Name> and Skill Description as <Skill Desc>
Then close browser


Examples: 
          |Skill Name|Skill Desc|
          |"Skill 101"|"Skill 101 desc"|
          |"Skill 102"|"Skill 102 desc"|
          |"Skill 103"|"Skill 103 desc"|