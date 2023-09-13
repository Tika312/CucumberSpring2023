package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BackgroundSteps {

    @Given("user open amazon.com")                    // эти методы обьявляем только один раз так как имя будет
    public void user_open_amazon_com() {            // одинаковое для всех
        System.out.println("opening amazon.com");
    }
    @Given("user click search button")
    public void user_click_search_button() {
        System.out.println("clicking search button");
    }
    @Then("hello")
    public void hello() {
        System.out.println("Say hello");
    }
    //@Given("user open amazon.com")
    //public void user_open_amazon_com() // так как имя методов одинаковы для intelijIdea будет считатся ошибкой
    //@Given("user click search button")  но под капотом будет работать эти методы для всех
    // public void user_click_search_button()
    @Then("hi")
    public void hi() {
        System.out.println("say Hi");
    }
    //@Given("user open amazon.com")
    //public void user_open_amazon_com() // так как имя методов одинаковы для intelijIdea будет считатся ошибкой
    //@Given("user click search button")  но под капотом будет работать эти методы для всех
    // public void user_click_search_button()
    @Then("hey")
    public void hey() {
        System.out.println("say Hey");
    }
    //@Given("user open amazon.com")
    //public void user_open_amazon_com() // так как имя методов одинаковы для intelijIdea будет считатся ошибкой
    //@Given("user click search button")  но под капотом будет работать эти методы для всех
    // public void user_click_search_button()
    @Then("whatsupp")
    public void whatsupp() {
        System.out.println("say whatsupp");
    }   


}
