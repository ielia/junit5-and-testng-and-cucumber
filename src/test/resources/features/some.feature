Feature: Some
  Scenario Outline: Some
    Given some <number>
    When some <string>
    Then something.
    Examples:
      | number | string  |
      | 1      | "thing" |
      | 2      | "thang" |