package com.ssu.csit.spring.core.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class App3 {

    private Client client;
    private EventLogger eventLogger;

    public App3(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main (String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring3.xml");
        App3 app = (App3) ctx.getBean("app");
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            Event event = (Event) ctx.getBean("event");
            event.setId(random.nextInt(1000));
            event.setMsg("Message # " + (i + 1));
            app.logEvent(event);
            Thread.sleep(1000);
        }
    }

    public void logEvent(Event event) {
        eventLogger.logEvent(event);
    }
}