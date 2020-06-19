package springboot;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Impl {

    ConfigProperties configProperties;

    public Impl(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    @PostConstruct
    public void run() {
//        System.out.println(configProperties.getFirstName());
        System.out.println(configProperties.getHostName());
    }

}
