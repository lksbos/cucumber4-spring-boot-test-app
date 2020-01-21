package features.steps;

import features.state.CommonSharedState;
import io.cucumber.java.en.Then;
import org.hamcrest.CoreMatchers;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonSteps {

    @Autowired
    private CommonSharedState state;

    @Then("The server returns status code {int} and an error message like {string}")
    public void theServerReturnsAnErrorMessageLike(Integer statusCode, String errorMessage) {
        state.getResponse().then()
                .statusCode(statusCode)
                .body("message", CoreMatchers.containsString(errorMessage));
    }
}
