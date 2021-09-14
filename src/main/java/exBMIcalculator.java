/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exBMIcalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight in POUNDS: ");
        double weight = sc.nextDouble();
        System.out.println("Please enter your height in INCHES: ");
        double height = sc.nextDouble();

        double bmi = (weight/(height*height))*703; //BMI Calculation

        System.out.printf("Your BMI is %.2f. \n", bmi);

        if(bmi < 18.5) //Determining the meaning of BMI based on the given range
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if(bmi > 25)
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else
        {
            System.out.println("You are within the ideal weight range.");
        }

    }
}
