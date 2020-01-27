# Cucumber 4 + Java 8 + Restful Webservices with SpringBoot 2 + SpringBootTest + Shared State

This is an example of how to configure cucumber 4 with multiple step classes running as SpringBootTest. 
Since the cucumber documentation is not clear and we have a lot of not well explained examples 
I wanted to register this one to make it easier.

### Features covered on this repo

* dependency injection inside the tests via cucumber-jvm
* two different step classes called in the same scenario
* different steps sharing state and being reset for each scenario (DirtyContext annotation)
* fake controller created in test scope, in case for some reason you need this, 
(in my case I needed for a project I was in that received an endpoint to call as a parameter)

### To Run the tests simply execute

`
$ ./gradlew clean build integrationTests
`

