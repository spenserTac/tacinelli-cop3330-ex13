/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the principal? ");
        String temp1 = scanner.nextLine();
        double principle = Double.parseDouble(temp1);

        System.out.print("What is the rate of interest? ");
        String temp2 = scanner.nextLine();
        double interest_rate = Double.parseDouble(temp2);

        System.out.print("WHat is the number of years? ");
        String temp3 = scanner.nextLine();
        double num_of_years = Double.parseDouble(temp3);

        System.out.print("What is the number of times the interest is compounded per year? ");
        String temp4 = scanner.nextLine();
        double compound_years = Double.parseDouble(temp4);

        //A = P(1 + r/n)^(n*t)
        double final_amount = principle * Math.pow((1 + ((interest_rate/100)/compound_years)), (num_of_years * compound_years));

        //$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
        System.out.println("$" + String.format("%.0f", principle) + " invested at " + interest_rate + "% for " +
                String.format("%.0f", num_of_years) + " years compounded " + String.format("%.0f", compound_years) + " times per year" +
                " is $" + String.format("%.2f", final_amount) + ".");
    }
}