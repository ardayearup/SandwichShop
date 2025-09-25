package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double regularPrice = 5.45;
        double largePrice = 8.95;

        System.out.print("Student age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Size choice: ");
        String sizeChoice = keyboard.nextLine();

        if (age <= 17 && (sizeChoice.equalsIgnoreCase("regular")))
        {
            double finalPrice = regularPrice - (regularPrice * 10 / 100);
            System.out.printf("Student gets 10%% discount and they will pay: " + finalPrice + "$");
        }

        else if (age <= 17 && (sizeChoice.equalsIgnoreCase("large")))
        {
            double finalPrice2 = largePrice - (largePrice * 10 / 100);
            System.out.printf("Student gets 10%% discount and they will pay: " + finalPrice2 + "$");
        }
        else if (age >= 65 && (sizeChoice.equalsIgnoreCase("regular"))) {
            double finalPrice3 = regularPrice - (regularPrice*20/100);
            System.out.printf("Senior gets 20%% discount and they will pay: " + finalPrice3 + "$");
        }
        else if (age >= 65 && (sizeChoice.equalsIgnoreCase("large"))) {
            double finalPrice4 = largePrice - (largePrice*20/100);
            System.out.printf("Senior gets 20%% discount and they will pay: " + finalPrice4 + "$");
        }
        else {
            System.out.printf("There will be no discount"); }


    }}