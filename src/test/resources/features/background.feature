@Background
Feature: How to use Background
# Background обычно используется для предисловий или когда шаги дублируется
  #эти шаги будут срабатывать перед каждым Scenario Given и AND
  Background: Open amazon and click search button
    Given user open amazon.com
    And user click search button

  Scenario: Amazon Test
                              #эти шаги будут срабатывать перед каждым Scenario Given и AND
    Then hello

  Scenario: Amazon Test1
                              #эти шаги будут срабатывать перед каждым Scenario Given и AND
    Then hi

  Scenario: Amazon Test2
                              #эти шаги будут срабатывать перед каждым Scenario Given и AND
    Then hey

  Scenario: Amazon Test3
                              #эти шаги будут срабатывать перед каждым Scenario Given и AND
    Then whatsupp