package features.steps;

import features.mock.FakeController;
import features.state.CommonSharedState;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.net.URI;

public class CommonSteps {

    @Autowired
    private CommonSharedState state;

    @Autowired
    private FakeController fakeController;

    @Then("The server returns status code {int} and an error message like {string}")
    public void theServerReturnsStatusCodeAndAnErrorMessageLike(Integer statusCode, String errorMessage) {
        state.getResponse().then()
                .statusCode(statusCode)
                .body("message", CoreMatchers.containsString(errorMessage));
    }

    @When("I call the fake endpoint")
    public void iCallTheFakeEndpoint() {
        state.setResponse(RestAssured.given().when().patch(URI.create("http://localhost:8888/fake-endpoint")).andReturn());
    }

    @Then("The call count should be {int}")
    public void theCallCountShouldBe(Integer count) {
        state.getResponse().then().statusCode(HttpStatus.OK.value());
        Assert.assertThat(fakeController.getCount(), Matchers.is(count));
    }


}
