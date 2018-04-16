package com.softserve.education.lib;

import com.softserve.education.entities.Doctor;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

public class Printer {
    public static void printSpecialists(List<Doctor> specialists) {
        for (Doctor spec : specialists) {
            System.out.println(specialists.indexOf(spec) + ". " + spec.toString());
        }
    }

    public static void printDaysOfWeek() {
        List<DayOfWeek> days = Arrays.asList(DayOfWeek.values());
        for (DayOfWeek day : days) {
            System.out.println(days.indexOf(day) + ". " + day);
        }
    }

    public static void printWorkingHours(int[] workingHours) {
        for (int hour : workingHours) {
            System.out.print(hour + " ");
        }
        System.out.println();
    }
}
