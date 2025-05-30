$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/makeMyTrip.feature");
formatter.feature({
  "name": "MakeMyTrip Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Payment options",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch MakeMyTrip Website",
  "keyword": "Given "
});
formatter.step({
  "name": "User selects from \"\u003cfromCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects to \"\u003ctoCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects \"\u003cdepartureDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "name": "User click on book now button",
  "keyword": "And "
});
formatter.step({
  "name": "User select radio button not to opt for secure trip",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Add new Adult Button",
  "keyword": "And "
});
formatter.step({
  "name": "User enters passenger informations - \"\u003cFirst Name\u003e\", \"\u003cLast Name\u003e\", \"\u003cMobile Number\u003e\", \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User confirms details",
  "keyword": "And "
});
formatter.step({
  "name": "User selects seats",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User review AddOns",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Proceed to pay button",
  "keyword": "When "
});
formatter.step({
  "name": "User must be displayed with payment options with Pay Now Button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fromCity",
        "toCity",
        "departureDate",
        "First Name",
        "Last Name",
        "Mobile Number",
        "Email"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Bengaluru",
        "May 31",
        "Test",
        "Singh",
        "1234567890",
        "a@a.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Payment options",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch MakeMyTrip Website",
  "keyword": "Given "
});
formatter.match({
  "location": "MakeMyTripStepDefs.launchAmazonWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects from \"Chennai\"",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userSelectsFrom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects to \"Bengaluru\"",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userSelectsTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects \"May 31\"",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userSelects(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userClicksOnSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on book now button",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userClickOnBookNowButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select radio button not to opt for secure trip",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userSelectRadioButtonNotToOptForSecureTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Add new Adult Button",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userClicksAddNewAdultButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters passenger informations - \"Test\", \"Singh\", \"1234567890\", \"a@a.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userEntersPassengerInformations(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userClicksOnContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirms details",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userConfirmsDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects seats",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userSelectsSeats()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userClicksOnContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userClicksOnContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User review AddOns",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userReviewAddOns()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Proceed to pay button",
  "keyword": "When "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userClicksProceedToPay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be displayed with payment options with Pay Now Button",
  "keyword": "Then "
});
formatter.match({
  "location": "MakeMyTripStepDefs.userMustBeDisplayedWithPaymentOptionsWithPayNowButton()"
});
formatter.result({
  "status": "passed"
});
});