package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ломаная линия
 */
    public class PolygonalLine {

        private List<Point> points = new ArrayList<>();

        /**
         * Устанавливает точки ломаной линии
         *
         * @param points массив точек, которыми нужно проинициализировать ломаную линию
         */
        public void setPoints(Point[] points) {
            this.points = new ArrayList<>();
            for (int i = 0; i < points.length; i++) {
                this.points.add(new Point(points[i].getX(), points[i].getY()));
            }
        }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {

        points.add(new Point(point.getX(), point.getY()));

    }
    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point newPoint = new Point(x, y);
        addPoint(newPoint);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // сумма длин всех её отрезков
        //sqrt((x2-x1)^2+(y2-y1)^2
        double length = 0;
        for (int i = 0; i<points.size()-1; i++) {
            double lx = points.get(i+1).getX() - points.get(i).getX();
            double ly = points.get(i+1).getY() - points.get(i).getY();
            length += Math.sqrt(Math.pow(lx,2)+Math.pow(ly,2));
        }
        return length;
    }

}
