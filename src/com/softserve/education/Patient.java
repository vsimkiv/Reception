package com.softserve.education;

public class Patient {
    private int idPatient;
    private String fullNamePatient;
    private int age;

    public Patient(int idPatient, String fullNamePatient, int age) {
        this.idPatient = idPatient;
        this.fullNamePatient = fullNamePatient;
        this.age = age;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return idPatient + ". " + fullNamePatient + "; "  + age;
    }
}
