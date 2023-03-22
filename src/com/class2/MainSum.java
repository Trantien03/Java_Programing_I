package com.class2;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        int sum=0;
        int number,i;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer :  ");
        number = scanner.nextInt();

        while( number <= 0){
            System.out.println("So nhap lai lon hon 0. Vui long nhap lai!");
            number = scanner.nextInt();
        }
        while( number > 0 ){
            i = number % 10;
            sum += i;
            number /= 10;
        }
        System.out.println("Sum =" + sum);


    }
}
