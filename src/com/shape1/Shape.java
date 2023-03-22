package com.shape1;

import java.util.Scanner;

abstract class Shape {
    abstract double getArea();

    abstract double getPerimeter();

    abstract void input(Scanner in);

    public abstract String toString();
}
