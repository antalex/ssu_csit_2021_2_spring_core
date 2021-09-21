package com.ssu.csit.spring.core.ex3;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event) {
        System.out.println(event);
    }
}
