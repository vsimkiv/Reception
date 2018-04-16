package com.softserve.education.entities;

import java.util.Scanner;

public class Patient {
    private String fullNamePatient;
    private int age;
    private String phone;


    public Patient(String fullNamePatient, int age, String phone) {
        this.fullNamePatient = fullNamePatient;
        this.age = age;
        this.phone = phone;

    }

    public Patient() {
        System.out.println("Hello, enter your name, please: ");
        fullNamePatient = new Scanner(System.in).nextLine();
        System.out.println("Hello, enter your age, please: ");
        age = new Scanner(System.in).nextInt();
        System.out.println("Hello, enter your phone, please: ");
        phone = new Scanner(System.in).nextLine();
    }

    public String getFullNamePatient() {
        return fullNamePatient;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return fullNamePatient + "\t\t\t" + age + "\t\t\t"  + phone;
    }
}
