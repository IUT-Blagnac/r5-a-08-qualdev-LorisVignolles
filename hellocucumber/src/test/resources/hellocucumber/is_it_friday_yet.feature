Feature: Is it Friday yet?
  As someone wondering about the day of the week,
  I want to know if it is Friday
  So that I can plan accordingly.

  Scenario Outline: Asking if it's Friday
    Given today is <day>
    When I ask whether it's Friday yet
    Then I should be told <answer>

  Examples:
    | day            | answer |
    | Friday         | TGIF   |
    | Sunday         | Nope   |
    | anything else! | Nope   |
