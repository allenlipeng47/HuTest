package eventlistener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @EventListener
    public void handleContextStart(MyEvent event) {
        System.out.println("Handling context started event." + event.i);
    }

}
