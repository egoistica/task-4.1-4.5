package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

      Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        int tempX = this.x;
        int tempY = this.y;

        this.x = -tempY;
        this.y = -tempX;
    }

    double distance(Point point) {

         double d = Math.sqrt(Math.pow((point.x - this.x),2) + Math.pow((point.y - this.y),2));
         return d;
    }

    public String toString(){
        String str = String.format("(%d, %d)", x, y);
        return str;
    }
}
