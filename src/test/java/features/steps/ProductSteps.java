package features.steps;


import features.state.CommonSharedState;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.hamcrest.CoreMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

public class ProductSteps {

    @Autowired
    private CommonSharedState state;

    @Given("I have the product with id {string} and type {string} in my database")
    public void iHaveTheProductWithIdAndTypeInMyDatabase(String id, String type) {
        //in a real app here is the place you are going to setup your data
    }

    @When("I hit the endpoint {string}")
    public void iHitTheEndpoint(String endpoint) {
        state.setResponse(RestAssured.given().when().get("http://localhost:8888".concat(endpoint)).andReturn());
    }

    @Then("The server returns the product with the following data")
    public void theServerReturnsTheProductWithTheFollowingData(List<Map<String, String>> data) {
        state.getResponse().then().statusCode(HttpStatus.OK.value())
                .and()
                .body("id", CoreMatchers.equalTo(Integer.valueOf(data.get(0).get("id"))))
                .body("name", CoreMatchers.equalTo(data.get(0).get("name")))
                .body("type", CoreMatchers.equalTo(data.get(0).get("type")));
    }
}
