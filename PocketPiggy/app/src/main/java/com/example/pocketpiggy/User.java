package com.example.pocketpiggy;

public class User {
    String name;
    String id;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
