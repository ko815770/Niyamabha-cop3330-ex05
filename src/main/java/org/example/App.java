
package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )
    {
        int first, second, sum, difference, product, quotient;
        System.out.println("What is the first number?");
        Scanner input = new Scanner(System.in);
        first = input.nextInt();
        System.out.println("What is the second number?");
        second = input.nextInt();
        sum = first + second;
        difference = first - second;
        product = first * second;
        quotient = first / second;
        System.out.println(first + " + " + second + " = " + sum + "\n"
                + first + " - " + second + " = " + difference + "\n"
                + first + " * " + second + " = " + product + "\n"
                + first + " / " + second + " = " + quotient);
    }
}