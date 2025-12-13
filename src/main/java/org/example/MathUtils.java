package org.example;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        long r = 1;
        for (int i = 2; i <= n; i++) r *= i;
        return r;
    }

    public static void main(String[] args) {
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("factorial(5) = " + factorial(5));
    }
}