package features.state;

import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Setter
@Getter
@Scope(SCOPE_CUCUMBER_GLUE)
/**
 * Check the official documentation here: https://github.com/cucumber/cucumber-jvm/tree/master/spring
 */
public class CommonSharedState {
    private Response response;
}
