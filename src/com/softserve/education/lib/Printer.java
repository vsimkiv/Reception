package com.softserve.education.lib;

import com.softserve.education.entities.Doctor;
import com.softserve.education.entities.Notation;

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

    public static void printRegistrationResult(Notation notation){
        System.out.println("Registration successful");
        System.out.println(notation.getPatient() + " is regіstered to " + notation.getDoctor() + " on "
                + notation.getDay() + " " + notation.getTime() + ".00\n");
    }
}
