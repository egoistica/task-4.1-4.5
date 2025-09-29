package com.example.task04;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2) {
        point1 = p1;
        point2 = p2;
    }

    public Point getP1() {return point1;}
    public Point getP2() {return point2;}

    public String toString() {
        return String.format("(%d, %d):(%d, %d)", point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }


    public boolean isCollinearLine(Point p){
        //(y2−y1)⋅(xp−x1)=(yp−y1)⋅(x2−x1)
        if ((point2.getY()- point1.getY())*(p.getX()- point1.getX())==(p.getY()- point1.getY())*(point2.getX()- point1.getX()))
            return true;
        else
            return false;
    }
}
