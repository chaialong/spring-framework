package spring.event.handling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventHandler implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("ContextStartedEvent received");
    }
}
