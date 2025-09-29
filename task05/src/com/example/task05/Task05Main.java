package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(5,6);
        Point point3 = new Point(9,10);

        System.out.println(point1);

        System.out.println(point1.getX());

        System.out.println(point1.getLength(point3));
    }
}
