$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Lic.feature");
formatter.feature({
  "name": "LICLifeInsurance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User to view in medical policy in LIC",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch the LIC Life Insurance Application \"https://licindia.in/insurance-plan\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.Insurance.StepDefinition.Lic.user_launch_the_LIC_Life_Insurance_Application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the value in search box",
  "keyword": "When "
});
formatter.match({
  "location": "in.Insurance.StepDefinition.Lic.user_enters_the_value_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "in.Insurance.StepDefinition.Lic.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check and view the medical policy for personal purpose",
  "keyword": "Then "
});
formatter.match({
  "location": "in.Insurance.StepDefinition.Lic.user_check_and_view_the_medical_policy_for_personal_purpose()"
});
formatter.result({
  "status": "passed"
});
});