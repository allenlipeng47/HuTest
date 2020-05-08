package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class App {

    // To test reading properties from yml file.
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
