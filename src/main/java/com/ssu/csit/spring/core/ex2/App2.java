package com.ssu.csit.spring.core.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

    private Client client;
    private EventLogger eventLogger;

    public App2(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main (String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring2.xml");
        App2 app = (App2) ctx.getBean("app");
        app.logEvent("Some event for 1");
        app.logEvent("Some event for 2");
    }

    public void logEvent(String msg) {
        msg = msg.replaceAll(client.getId(), client.getName());
        eventLogger.logEvent(msg);
    }
}