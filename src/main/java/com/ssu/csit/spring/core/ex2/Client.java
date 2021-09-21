package com.ssu.csit.spring.core.ex2;

public class Client {

    private String id;
    private String name;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Client() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
