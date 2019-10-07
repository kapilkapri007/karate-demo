@employee-get
Feature: Get All employee details
  mvn test -Dcucumber.options="--tags @employee" -Dtest=EmployeeRunner
  mvn test -Dkarate.options="--tags @employee" -Dtest=EmployeeRunner

  Background:
    * url 'http://dummy.restapiexample.com/api/v1/employees'

  Scenario: get all users
    When method get
    Then status 200

    * print response
    * def dummyName = "kapil"
    * def updatedName = Java.type('pulse.employee.StringUtil').toUpperCase(dummyName)
    * print updatedName


