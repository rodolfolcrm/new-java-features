package com.rodolfolcrm.java14;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchExpressionsTest {

    @Test
    void num_letters_of_week_days() {
        assertThat(SwitchExpressions.numLetters(DayOfWeek.MONDAY)).isEqualTo(6);
        assertThat(SwitchExpressions.numLetters(DayOfWeek.FRIDAY)).isEqualTo(6);
        assertThat(SwitchExpressions.numLetters(DayOfWeek.SUNDAY)).isEqualTo(6);
        assertThat(SwitchExpressions.numLetters(DayOfWeek.TUESDAY)).isEqualTo(7);
        assertThat(SwitchExpressions.numLetters(DayOfWeek.THURSDAY)).isEqualTo(8);
        assertThat(SwitchExpressions.numLetters(DayOfWeek.SATURDAY)).isEqualTo(8);
        assertThat(SwitchExpressions.numLetters(DayOfWeek.WEDNESDAY)).isEqualTo(9);
    }
}