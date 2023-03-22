package com.shape1;

import java.util.Scanner;

class Rectangle extends Shape {
    double a;
    double b;

    @Override
    double getArea() {
        return a * b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    void input(Scanner in) {
        System.out.println("Please input length of Rectangle: ");
        a = in.nextDouble();
        System.out.println("Please input side width of Rectangle: ");
        b = in.nextDouble();
    }

    @Override
    public String toString() {
        return "Rectangle (a=" + a + ";b=" + b + ")" +
                " : P= " + getPerimeter() + ";S= " + getArea();
    }
}
