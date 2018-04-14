package com.softserve.education.entities;

import java.time.DayOfWeek;

public class RegisterNotation {
    private int idNotation = 0;
    private String fullNamePatient;
    private String fullNameDoctor;
    private DayOfWeek day;
    private int time;

    public RegisterNotation(int idNotation, String fullNamePatient, String fullNameDoctor, DayOfWeek day, int time) {
        this.idNotation = idNotation++;
        this.fullNamePatient = fullNamePatient;
        this.fullNameDoctor = fullNameDoctor;
        this.day = day;
        this.time = time;
    }

    @Override
    public String toString() {
        return idNotation + ".\t\t" + fullNamePatient + "\t\t" + fullNameDoctor + "\t\t" + day.toString() + "  " + time;
    }
}
