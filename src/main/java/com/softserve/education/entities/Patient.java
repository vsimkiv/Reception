package com.softserve.education.entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Patient extends Person {
    private int age;
    private String phone;


    public Patient(String fullName, int age, String phone) throws InputMismatchException {
        super(fullName);
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must me positive");
            this.phone = phone;
        }
    }

    public Patient() throws InputMismatchException {
        System.out.println("Hello, enter your name, please: ");
        setFullName(new Scanner(System.in).nextLine());
        System.out.println("Hello, enter your age, please: ");
        int input = new Scanner(System.in).nextInt();
        if (input >= 0) {
            age = input;
        } else {
            System.out.println("Age must me positive");
        }

        System.out.println("Hello, enter your phone, please: ");
        phone = new Scanner(System.in).nextLine();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InputMismatchException {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must me positive");
        }
    }

    public String getPhone() {
        return phone;

    }

    @Override
    public String toString() {
        return getFullName() + "\t\t\t" + age + "\t\t\t" + phone;
    }
}
