package com.deven;


abstract class Shape {
    abstract double area();
    abstract double volume();
}

abstract class TwoDShape extends Shape {
    @Override
    double volume() {
        return 0;
    }
}

abstract class ThreeDShape extends Shape {
}

class Circle extends TwoDShape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends TwoDShape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Sphere extends ThreeDShape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

class Cube extends ThreeDShape {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Sphere(3),
            new Cube(2)
        };

        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
            System.out.println("Volume: " + s.volume());
            System.out.println();
        }
    }
}