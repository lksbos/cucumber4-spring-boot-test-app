package features.steps;

import com.example.cucumber.CucumberAppApplication;
import features.config.TestConfiguration;
import io.cucumber.java.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, properties = "server.port=8888")
@ContextConfiguration(classes = {CucumberAppApplication.class, TestConfiguration.class})
@ActiveProfiles("test")
@DirtiesContext
public class ContextLoader {
    /**
        This is the most important stuff here. You need just one class configured with the annotation
     @ContextConfiguration in the same package as your steps.
     In order for cucumber recognized it as a test you need to have at least one cucumber annotation
     which in this case is the @Before you are seeing bellow
     */
    @Before()
    public void setUp() {
        System.out.println("I'm responsible for configuring the spring boot tests");
    }
}