package intellijstructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    private int a;

    protected int b;

    int c;

    public int d;

    final int e = 1;

    static int f;

    final static int g = 1;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
