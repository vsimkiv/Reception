package com.softserve.education.entities;

public class Patient {
    private String fullNamePatient;
    private int age;

    public Patient(String fullNamePatient, int age) {

        this.fullNamePatient = fullNamePatient;
        this.age = age;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return fullNamePatient + " (" + age + (")");
    }
}
