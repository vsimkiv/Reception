package com.softserve.education.entities;

import java.time.DayOfWeek;

public class Notation{
    private int id;
    private String patient;
    private String doctor;
    private DayOfWeek day;
    private String hour;

    public Notation(String patient, String doctor, DayOfWeek day, String hour) {
        this.patient = patient;
        this.doctor = doctor;
        this.day = day;
        this.hour = hour;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return patient + "\t" + doctor + "\t" + day + "\t" + hour + "\n";
    }
}
