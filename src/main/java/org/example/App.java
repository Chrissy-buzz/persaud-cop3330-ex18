package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */
public class App 
{
    public static double CtoF (int celsius)
    {
        return (celsius * (9/5))+32;
    }
    public static double FtoC (int fahrenheit)
    {
        return (5*(fahrenheit- 32))/9;
    }

    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Celsius to Fahrenheit.\nPress F to convert from Fahrenheit to Celsius.\n");
        String ans = input.nextLine();

        switch(ans.toLowerCase()){
            case "f":
                System.out.print("Your choice: F\n");
                Scanner input1 = new Scanner(System.in);
                System.out.print("Please enter the temperature in Fahrenheit: ");
                int fahrenheit = input1.nextInt();
                double conversion;
                conversion= FtoC (fahrenheit);
                System.out.print("The temperature in Celsius is " + conversion + " \n");
                break;
            case "c":
                System.out.print("Your choice: C\n");
                Scanner input2 = new Scanner(System.in);
                System.out.print("Please enter the temperature in Clesius: ");
                int celsius = input2.nextInt();
                double conversion2;
                conversion2= CtoF (celsius);
                System.out.print("The temperature in Farenheit is " + conversion2 +" \n");
                break;
        }
    }
}
