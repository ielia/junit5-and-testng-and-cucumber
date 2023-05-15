Feature: Multiplication
  Scenario Outline: Multiplying 1
    Given an A with value <a>
    Given a B with value <b>
    When I multiply both values
    Then I get value <res>.
    Examples:
      | a | b | res |
      | 5 | 7 | 35  |
      | 2 | 9 | 18  |

  Scenario Outline: Multiplying 2
    Given an A with value <a>
    Given a B with value <b>
    When I multiply both values
    Then I get value <res>.
    Examples:
      | a | b | res |
      | 7 | 5 | 35  |
      | 9 | 2 | 18  |