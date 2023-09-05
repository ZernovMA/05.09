package org.example;

public class MyMath {
    private static final double PI = 3.141592653589793;
    private static final double E = 2.71828182845;

    public static double minNum(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else return num2;
    }

    public static double arccos(double angle) {
        double arcsine = Math.asin(angle);
        double arcCosine = PI / 2 - arcsine;
        return arcCosine;
    }



    public static void arcsin() {
    }

    public static void arctg() {
    }

    public static double A(double r) {
        return PI * (r * r);
    }

    public static double D(double r) {
        return 2 * PI * r;
    }

    public static double step(double base, int exponent) {
        if (exponent < 0) {
            double result = 1;
            for (int i = 0; i < -exponent; i++) {
                result *= base;
            }
            return 1/result;
        }
        if (exponent == 0) {
            return 1;
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
