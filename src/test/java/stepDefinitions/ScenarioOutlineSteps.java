package stepDefinitions;

import io.cucumber.java.en.Given;

public class ScenarioOutlineSteps {

    @Given("enter first name {string}")
    public void enter_first_name(String string) {
        System.out.println(string);
    }
    @Given("enter last name {string}")
    public void enter_last_name(String string) {
        System.out.println(string);
    }
    @Given("enter email {string}")
    public void enter_email(String string) {
        System.out.println(string);
    }
}
