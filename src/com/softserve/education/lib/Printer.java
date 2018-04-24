package com.softserve.education.lib;

import com.softserve.education.entities.Doctor;
import com.softserve.education.entities.Notation;
import com.softserve.education.lib.enums.Specializations;
import com.softserve.education.lib.enums.WorkingHours;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

public class Printer {
    static void printSpecializations() {
        Specializations[] specializations = Specializations.values();
        for (Specializations specialization : specializations) {
            System.out.println(specialization);
        }
    }

    static void printSpecialists(List<Doctor> specialists) {
        for (Doctor spec : specialists) {
            System.out.println(specialists.indexOf(spec) + ". " + spec.toString());
        }
    }

    static void printDaysOfWeek() {
        List<DayOfWeek> days = Arrays.asList(DayOfWeek.values());
        for (DayOfWeek day : days) {
            System.out.println(days.indexOf(day) + ". " + day);
        }
    }

    static void printWorkingHours() {
        WorkingHours[] workingHours = WorkingHours.values();
        for (WorkingHours hour : workingHours) {
            System.out.println(hour);
        }
    }

    public static void printRegistrationResult(Notation notation) {
        System.out.println("Registration successful");
        System.out.println(notation.getPatient() + " is registered to " + notation.getDoctor() + " on "
                + notation.getDay() + " " + notation.getHour() + "\n");
    }
}