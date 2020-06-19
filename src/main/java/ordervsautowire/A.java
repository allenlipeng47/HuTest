package ordervsautowire;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-1)
public class A {
    public A() {
        System.out.println("a");
    }
}
