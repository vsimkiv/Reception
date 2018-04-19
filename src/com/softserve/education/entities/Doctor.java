package com.softserve.education.entities;

import com.softserve.education.lib.enums.Specializations;

public class Doctor {
    private String fullNameDoc;
    private Specializations specialization;

    public Doctor(String fullNameDoc, Specializations specialization){
        this.fullNameDoc = fullNameDoc;
        this.specialization = specialization;

    }

    public String getFullNameDoc() {
        return fullNameDoc;
    }

    public Specializations getSpecialization() {
        return specialization;
    }


    @Override
    public String toString() {
        return fullNameDoc + "; " + specialization.getValue();
    }
}
