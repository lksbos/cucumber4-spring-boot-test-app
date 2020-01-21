package features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@Ignore
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:build/reports/cucumber" },
        glue = "features.steps",
        features = "src/test/resources/features/"
)
public class RunCucumberTest {
}
