package com.softserve.education.lib;

import com.softserve.education.entities.Doctor;

import java.time.DayOfWeek;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Selector {
    public static List<Doctor> selectSpecialist(Doctor[] doctors) {
        System.out.println("What specialist do you need?");
        System.out.println(java.util.Arrays.asList(Specializations.values()));

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        List<Doctor> doctorList = new LinkedList<>();

        for (Doctor d : doctors) {
            if (choice == d.getSpecialization().getKey()) {
                doctorList.add(d);
            }
        }
        System.out.println(doctorList);
        return doctorList;
    }

    public static Doctor selectDoctor(List<Doctor> doctorList) {
        System.out.println("Select doctor, please: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        Doctor selectedDoctor = null;
        for (Doctor d : doctorList) {
            if (choice == d.getId()) {
                selectedDoctor = d;
            }
        }
        return selectedDoctor;
    }

    public static DayOfWeek selectDay(Doctor d) {
        System.out.println("Select day, please: ");
        DayOfWeek[] days = d.getFosterDays();

        for (DayOfWeek day : days) {
            System.out.println(day.toString());
        }

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        DayOfWeek selectedDay = null;
        for (DayOfWeek day : days) {
            if (choice.equals(day.toString())) {
                selectedDay = day;
            }
        }
        return selectedDay;
    }

    public static int selectTime() {
        System.out.println("Select time, please: ");
        return new Scanner(System.in).nextInt();
    }
}
