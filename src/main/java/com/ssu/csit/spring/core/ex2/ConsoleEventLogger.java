package com.ssu.csit.spring.core.ex2;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
