package com.softserve.education.entities;

import com.softserve.education.lib.Specializations;

import java.time.DayOfWeek;

public class Doctor {
    private int id;
    private String fullNameDoc;
    private Specializations specialization;
    private DayOfWeek[] fosterDays;

    public Doctor(int id, String fullNameDoc, Specializations specialization, DayOfWeek[] fosterDays) {
        this.id = id;
        this.fullNameDoc = fullNameDoc;
        this.specialization = specialization;
        this.fosterDays = fosterDays;
    }

    public int getId() {
        return id;
    }

    public String getFullNameDoc() {
        return fullNameDoc;
    }

    public Specializations getSpecialization() {
        return specialization;
    }

    public DayOfWeek[] getFosterDays() {
        return fosterDays;
    }

    @Override
    public String toString() {
        return id + ". " + fullNameDoc + "; " + specialization.getValue();
    }
}
