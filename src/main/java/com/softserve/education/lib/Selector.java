package com.softserve.education.lib;

import com.softserve.education.entities.Doctor;
import com.softserve.education.lib.enums.WorkingHours;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Selector {
    public static List<Doctor> selectSpecialist(List<Doctor> doctors) {
        int choice = new Scanner(System.in).nextInt();

        List<Doctor> specDoctors = new ArrayList<>();
        for (Doctor doc : doctors) {
            if (doc.getSpecialization().getKey() == choice) {
                specDoctors.add(doc);
            }
        }
        return specDoctors;
    }

    public static Doctor selectDoctor(List<Doctor> specialists) {
        int choice = new Scanner(System.in).nextInt();

        Doctor selectedDoctor = null;
        for (Doctor spec : specialists) {
            if (choice == specialists.indexOf(spec)) {
                System.out.println("Your doctor is " + spec.getFullName());
                selectedDoctor = spec;
            }
        }
        return selectedDoctor;
    }

    public static DayOfWeek selectDay() {
        List<DayOfWeek> days = Arrays.asList(DayOfWeek.values());
        int choice = new Scanner(System.in).nextInt();

        DayOfWeek day = null;
        for (DayOfWeek d : days) {
            if (choice == days.indexOf(d)) {
                System.out.println("You chose " + d);
                day = d;
            }
        }
        return day;
    }

    public static String selectHour(){
        List<WorkingHours> workingHours = Arrays.asList(WorkingHours.values());
        int choice = new Scanner(System.in).nextInt();

        String myHour = "No specific time";
        for (WorkingHours hour : workingHours){
            if (choice == hour.getKey()){
                System.out.println("You chose " + hour.getValue());
                myHour = hour.getValue();
            }
        }
        return myHour;
    }
}
