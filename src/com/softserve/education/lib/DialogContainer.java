package com.softserve.education.lib;

import com.softserve.education.entities.Doctor;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

import static com.softserve.education.lib.Printer.printDaysOfWeek;
import static com.softserve.education.lib.Printer.printSpecialists;
import static com.softserve.education.lib.Printer.printWorkingHours;
import static com.softserve.education.lib.Selector.*;

public class DialogContainer {
    public static Doctor chooseDoctor(List<Doctor> doctors){
        System.out.println("Hello. What specialist are You interested in?");
        System.out.println(Arrays.asList(Specializations.values()));
        System.out.println("Choose Your Doctor, please");
        List<Doctor> specialists = selectSpecialist(doctors);
        printSpecialists(specialists);
        return selectDoctor(specialists);
    }

    public static DayOfWeek chooseDay() {
        System.out.println("Choose a day, please");
        printDaysOfWeek();
        return selectDay();
    }

    public static int chooseTime(int[] workingHours) {
        System.out.println("Choose an hour, please");
        printWorkingHours(workingHours);
        return selectHour(workingHours);
    }
}
