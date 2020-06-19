package ordervsautowire.ordertesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class B {

    private List<A> aList;

    public B(@Autowired List<A> aList) {
        System.out.println(aList);
    }

}
