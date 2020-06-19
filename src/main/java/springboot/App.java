package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class App {

    // To test reading properties from yml file.
    // -Dspring.profiles.active overrides application.yml
    // -Dspring.profiles.include does not override. It only supplementary.
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
