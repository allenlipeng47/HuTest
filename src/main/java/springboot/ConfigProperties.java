package springboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("mail")
public class ConfigProperties {

    private String hostName;
    private int port;
    private String from;
    private String firstName;   // in application.yml, it can map to first-name or firstname

}
