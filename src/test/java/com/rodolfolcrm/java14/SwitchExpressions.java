package com.rodolfolcrm.java14;

import java.time.DayOfWeek;

public class SwitchExpressions {

    public static int numLetters(DayOfWeek day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
    }
}
