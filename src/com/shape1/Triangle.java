package com.shape1;

import java.util.Scanner;

class Triangle extends Shape {
    double a;
    double b;
    double c;

    @Override
    double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    void input(Scanner in) {
        System.out.println("Please input side A of Triangle: ");
        a = in.nextDouble();
        System.out.println("Please input side B of Triangle: ");
        b = in.nextDouble();
        System.out.println("Please input side C of Triangle: ");
        c = in.nextDouble();
    }

    @Override
    public String toString() {
        return "Triangle (a=" + a + ";b=" + b + ";c=" + c +")" +
                " : P= " + getPerimeter() + ";S= " + getArea();
    }

}
