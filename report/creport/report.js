$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/log.feature");
formatter.feature({
  "name": "Login feature",
  "description": "  i will test the login page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Orange Hrm site and Php travel site login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I will land the \"\u003curl\u003e\"login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I will enter the user \"\u003cname\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I verify the login page \"\u003cTitle\u003e\".",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "password",
        "url",
        "Title"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123",
        "https://opensource-demo.orangehrmlive.com/",
        "OrangeHRM"
      ]
    },
    {
      "cells": [
        "admin@phptravels.com",
        "demoadmin",
        "https://www.phptravels.net/admin",
        "Administator Login"
      ]
    }
  ]
});
formatter.background({
  "name": "Browser launch",
  "description": "    Given: Browser will open",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Orange Hrm site and Php travel site login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "I will land the \"https://opensource-demo.orangehrmlive.com/\"login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.steps.Stepdefination.i_will_land_the_https_opensource_demo_orangehrmlive_com_login_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will enter the user \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.Stepdefination.i_will_enter_the_user_Admin_and_admin123(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the login page \"OrangeHRM\".",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.Stepdefination.i_verify_the_login_page_Title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Browser launch",
  "description": "    Given: Browser will open",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Orange Hrm site and Php travel site login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "I will land the \"https://www.phptravels.net/admin\"login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.steps.Stepdefination.i_will_land_the_https_opensource_demo_orangehrmlive_com_login_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will enter the user \"admin@phptravels.com\" and \"demoadmin\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.Stepdefination.i_will_enter_the_user_Admin_and_admin123(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the login page \"Administator Login\".",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.Stepdefination.i_verify_the_login_page_Title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});