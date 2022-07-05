package com.company;

public class Circle {
    private static final double PI = 3.14;

    public static void area() {
        int radius = 16;
       double area = PI * (radius * radius);
        System.out.println("The area is: " + area);
    }

    public static void circumference() {
        int radius = 16;
       double circum = PI * 2 * radius;
        System.out.println("The Circumference is: " + circum);
    }
}
