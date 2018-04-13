package com.softserve.education;

public enum Specializations {
    GASTROENTEROLOGIST(1, "Gastroenterologist"),
    OTOLARYNGOLIST(2, "Otolaryngolist"),
    DERMATOLOGIST(3, "Dermatologist"),
    GYNECOLOGIST(4, "Gynecologist"),
    UROLOGIST(5, "Urologist");

    private int key;
    private String value;

    Specializations(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ". " + value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
