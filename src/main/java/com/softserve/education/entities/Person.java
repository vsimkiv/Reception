package com.softserve.education.entities;

public class Person {
    private String fullName;

    Person(String fullName) {
        this.fullName = fullName;
    }

    Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
