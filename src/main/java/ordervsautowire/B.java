package ordervsautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

public class B {

    private A a;

    public B(@Autowired A a) {
        System.out.println("b");
    }

}
