@employee
Feature: tags test
  mvn test -Dcucumber.options="--tags @employee" -Dtest=EmployeeRunner
  mvn test -Dkarate.options="--tags @employee" -Dtest=EmployeeRunner

  @first
  Scenario: first
    * print 'first'

  @second
  Scenario: second
    * print 'second'

  @third
  Scenario: f1 - s1
    * print 'first feature:@discount, first scenario'

  @fire
  Scenario: f1 - s2
    * print 'first feature:@discount, second scenario:@fire'


  Scenario: Read Json Data
    * string json = read('products.json')
    * print json

