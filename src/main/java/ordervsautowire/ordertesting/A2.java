package ordervsautowire.ordertesting;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class A2 implements A{

    public A2() {
        System.out.println("a2");
    }
}
