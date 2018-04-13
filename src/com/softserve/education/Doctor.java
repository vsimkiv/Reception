package com.softserve.education;

import java.time.DayOfWeek;

public class Doctor {
    private int id;
    private String fullNameDoc;
    private String specialization;
    private DayOfWeek[] fosterDays;

    public Doctor(int id, String fullNameDoc, String specialization, DayOfWeek[] fosterDays) {
        this.id = id;
        this.fullNameDoc = fullNameDoc;
        this.specialization = specialization;
        this.fosterDays = fosterDays;
    }

    public Doctor() {
    }

    public int getId() {
        return id;
    }

    public String getFullNameDoc() {
        return fullNameDoc;
    }

    public String getSpecialization() {
        return specialization;
    }

    public DayOfWeek[] getFosterDays() {
        return fosterDays;
    }

    @Override
    public String toString() {
        return id + ". " + fullNameDoc + "; " + specialization;
    }
}
