package eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {

    private ApplicationEventPublisher applicationEventPublisher;

    // No need to new ApplicationEventPublisher anywhere, just do like this. ApplicationEventPublisher can be injected
    public MyEventPublisher(@Autowired ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Scheduled(fixedRate = 1000)
    public void scheduler() {
        System.out.println("Publishing custom event. ");
        MyEvent myEvent = new MyEvent(1);
        applicationEventPublisher.publishEvent(myEvent);
    }


}
