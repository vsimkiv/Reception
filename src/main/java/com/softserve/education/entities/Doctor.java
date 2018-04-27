package com.softserve.education.entities;

import com.softserve.education.lib.enums.Specializations;

public class Doctor extends Person{
    private Specializations specialization;

    public Doctor(String fullName, Specializations specialization) {
        super(fullName);
        this.specialization = specialization;
    }

    public Specializations getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return getFullName() + "; " + specialization.getValue();
    }
}
