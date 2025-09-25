package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double regularPrice = 5.45;
        double largePrice = 8.95;

        System.out.print("Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Size choice (regular/large): ");
        String sizeChoice = keyboard.nextLine();

        System.out.print("Loaded (yes/no): ");
        String loadedChoice = keyboard.nextLine();

         if (loadedChoice.equalsIgnoreCase("Yes"))
         { regularPrice = regularPrice +1;
             largePrice = largePrice +1.75; }

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
        else if (sizeChoice.equalsIgnoreCase("regular")) {
            System.out.printf("There will be no discount and you will pay " + regularPrice); }
        else {
            System.out.printf("There will be no discount and you will pay " +  largePrice); }


    }}