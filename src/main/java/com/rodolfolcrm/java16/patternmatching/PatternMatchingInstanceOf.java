package com.rodolfolcrm.java16.patternmatching;

public class PatternMatchingInstanceOf {

    public static boolean isJava16Str(Object obj) {
        /*
         * Old  way
         *
         * if (obj instanceof String) {
         *      String s = (String) obj;
         *      return s.equalsIgnoreCase("java16"));
         * }
         */
        return obj instanceof String s && s.equalsIgnoreCase("java16");
    }
}
