package ordervsautowire.ordertesting;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class A1 implements A{

    public A1() {
        System.out.println("a1");
    }
}
