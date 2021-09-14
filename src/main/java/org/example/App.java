/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of item 1:");
        String itemOnePriceStr = input.next();
        System.out.println("Enter the quantity of item 1:");
        String itemOneQuanityStr = input.next();

        System.out.println("Enter the price of item 2:");
        String itemTwoPriceStr = input.next();
        System.out.println("Enter the quantity of item 2:");
        String itemTwoQuanityStr = input.next();

        System.out.println("Enter the price of item 3:");
        String itemThreePriceStr = input.next();
        System.out.println("Enter the quantity of item 3:");
        String itemThreeQuanityStr = input.next();

        //constants
        double taxRate = 0.055;

        //conversions to numerical data
        double itemOnePrice = Double.parseDouble(itemOnePriceStr);
        int itemOneQuantity = Integer.parseInt(itemOneQuanityStr);

        double itemTwoPrice = Double.parseDouble(itemTwoPriceStr);
        int itemTwoQuantity = Integer.parseInt(itemTwoQuanityStr);

        double itemThreePrice = Double.parseDouble(itemThreePriceStr);
        int itemThreeQuantity = Integer.parseInt(itemThreeQuanityStr);

        //calculations
        double subtotalCost = (itemOnePrice * itemOneQuantity) + (itemTwoPrice * itemTwoQuantity) + (itemThreePrice * itemThreeQuantity);
        double tax = subtotalCost * taxRate;
        double totalCost = subtotalCost + tax;

        //output
        System.out.println(String.format("Subtotal: $%.2f", subtotalCost));
        System.out.println(String.format("Tax: $%.2f", tax));
        System.out.println(String.format("Total: $%.2f", totalCost));





    }
}
