package ordervsautowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // (scanBasePackages = "ordervsautowire" )
public class App {

    public static void main(String[] args) {
        SpringApplication.run(ordervsautowire.App.class, args);
    }
}
