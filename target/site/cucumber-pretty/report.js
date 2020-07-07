$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/loginTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: azizulsyed@gmail.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary: It will verify Login functionality"
    },
    {
      "line": 3,
      "value": "#URL :http://www.executeautomation.com/demosite/Login.html"
    }
  ],
  "line": 4,
  "name": "Login Functionality",
  "description": "\tThis Feature deal with the login functionality of the application",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Verify user should be able to login with correct username and password in FB",
  "description": "",
  "id": "login-functionality;verify-user-should-be-able-to-login-with-correct-username-and-password-in-fb",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user click Signin",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});