package com.rodolfolcrm.java16.patternmatching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingInstanceOfTest {

    @Test
    void isJava16Str() {
        assertThat(PatternMatchingInstanceOf.isJava16Str("java15")).isFalse();
        assertThat(PatternMatchingInstanceOf.isJava16Str(new Object())).isFalse();
        assertThat(PatternMatchingInstanceOf.isJava16Str("java16")).isTrue();
    }
}