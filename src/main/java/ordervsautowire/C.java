package ordervsautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {

    public C(@Autowired B b) {

    }
}
