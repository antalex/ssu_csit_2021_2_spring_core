package com.ssu.csit.spring.core.ex1;

public class App {

    private Client client;
    private ConsoleEventLogger eventLogger;

    public static void main (String[] args) {
        App app = new App();
        app.client = new Client("1", "Will Smith");
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Some event for user 1");
    }

    public void logEvent(String msg) {
        msg = msg.replaceAll(client.getId(), client.getName());
        eventLogger.logEvent(msg);
    }
}