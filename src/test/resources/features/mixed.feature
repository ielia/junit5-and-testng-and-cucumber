@mixed
Feature: Mixed feature

  Scenario Outline: Scenario 1 (A=<A>, B=<B>, C=<C>, Result=<Result>)
    Given an A with value <A> and a B with value <B>
    And some <C>
    When I multiply both values
    And some "whatever"
    Then I get value <Result>.
    And something.
    Examples:
    | A | B | C | Result |
    | 1 | 2 | 3 | 2      |
    | 3 | 5 | 1 | 15     |
    | 4 | 6 | 6 | 24     |
    | 8 | 7 | 5 | 56     |
    | 9 | 0 | 4 | 0      |

  Scenario: Scenario 2
    Given an A with value 2 and a B with value 2
    And some -2
    When I multiply both values
    And some "string of mine"
    Then something.

  Scenario: Scenario 3
    Given an A with value 3 and a B with value 3
    And some -5
    When I multiply both values
    And some "another string"
    Then something.
