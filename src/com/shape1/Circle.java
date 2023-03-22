package com.shape1;

import java.util.Scanner;

class Circle extends Shape {
    double r;

    @Override
    double getArea() {
        return Math.PI * r * r;
    }

    @Override
    double getPerimeter() {
        return Math.PI * 2 * r;
    }

    @Override
    void input(Scanner in) {
        System.out.println("Please input radius of Circle ");
        r = in.nextDouble();
    }

    @Override
    public String toString() {
        return "Circle (r=" + r + ")" +
                " : P= " + getPerimeter() + ";S= " + getArea();
    }
}

