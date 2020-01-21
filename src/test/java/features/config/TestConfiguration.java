package features.config;

import features.state.CommonSharedState;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("features.config")
public class TestConfiguration {
    @Bean
    public CommonSharedState getCommonSharedState(){
        return new CommonSharedState();
    }
}
