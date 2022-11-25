package org.itmo.lab3.story;

public enum Time {
    JUST_THE_DAY_BEFORE("Ну, а как раз накануне");

    private final String time;
    Time(String time)
    {
        this.time = time;
    }

    public String getName() {
        return this.time;
    }
}