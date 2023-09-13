package stepDefinitions;

import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableSteps {


    @Given("user is on registration page")
    public void user_is_on_registration_page() {

    }
    @Given("fill up the form with following data")
    public void fill_up_the_form_with_following_data(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String name = data.get(0).get(1);
        System.out.println(name);

    }

}
