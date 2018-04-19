package com.softserve.education.lib.enums;

public enum WorkingHours {
    NINE (0, "9:00"),
    TEN (1, "10:00"),
    ELEVEN (2, "11:00"),
    TWELVE (3, "12:00"),
    THIRTEEN (4, "13:00"),
    FOURTEEN (5, "14:00"),
    FIFTEEN (6, "15:00"),
    SIXTEEN (7, "16:00"),
    SEVENTEEN (8, "17:00");

    private int key;
    private String value;

    WorkingHours(int key, String value) {
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
