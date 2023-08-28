package com.road.regex;

public class FullName {
    private final String name;
    private final String lastName;
    private final String surName;

    public FullName(String name, String surName, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
    }
    public void printFullName(){
        System.out.printf("Full name is %s %s %s", name, surName, lastName);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }
}
