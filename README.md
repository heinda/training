# Running Unit tests vs. running integration tests

## choose the proper plugin:

### maven-surefire-plugin : run the unit tests
-  if any of the tests fail then it will fail the build immediately.

### maven-failsafe-plugin : run your integration tests
- decouples failing the build if there are test failures from running the tests.
- The Failsafe Plugin has two goals:
  1. **failsafe:integration-test** runs the integration tests of an application,
  2. **failsafe:verify** verifies that the integration tests of an application passed.
