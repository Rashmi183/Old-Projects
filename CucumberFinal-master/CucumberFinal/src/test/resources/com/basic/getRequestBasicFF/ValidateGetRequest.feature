Feature: Testing Rest Assured Get basics

Scenario: 1.I want to test get request
Given race circuit application is running
When I hit get request to get response
Then I validate circuit "MRData.limit" value as "30" present
Then I validate circuit "MRData.total" value as "20" present
Then I validate circuit "MRData.CircuitTable.Circuits[0].circuitId" value as "albert park" present
Then I validate circuit id value
 