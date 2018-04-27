package com.softserve.education.lib.enums;

public enum Specializations {
    GASTROENTEROLOGIST(0, "Gastroenterologist"),
    OTOLARYNGOLIST(1, "Otolaryngolist"),
    DERMATOLOGIST(2, "Dermatologist"),
    GYNECOLOGIST(3, "Gynecologist"),
    UROLOGIST(4, "Urologist");

    private int key;
    private String value;

    Specializations(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return key + ". " + value;
    }
}
