package org.klozevitz.easybot_test.util;

public class Validations {
    public static boolean isDataValid(Integer sn, String b, Double p, Integer a) {
        if (sn == null || b == null || p == null || a == null) return false;
        return (sn > 0 && !b.equals("") && p > 0 && a >= 0);
    }

    public static boolean isFormValid(String form) {
        return form.equalsIgnoreCase("десктоп") ||
                form.equalsIgnoreCase("неттоп") ||
                form.equalsIgnoreCase("моноблок");
    }

    public static boolean isSizeValid(int size) {
        return (size >= 13 && size <= 17 && size != 16);
    }

    public static boolean isDiagValid(double diag) {
        return diag > 5.0 && diag < 100.0;
    }

    public static boolean isVolumeValid(double volume) {
        return volume >= 32 && volume <= 20000;
    }
}
