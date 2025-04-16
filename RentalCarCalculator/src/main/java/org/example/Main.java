package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("pickup a month(1-12): ");
        String month = scanner.nextLine();

        // ask for the day

        System.out.print("pickup day (1-30): ");
        String day = scanner.nextLine();

        System.out.print("Number of days for the rental: ");
        String days_of_rental = scanner.nextLine();

        //want a electronic toll tag
        System.out.print("want an electronic toll tag at $3.95/day (y/n)");
        String input = scanner.nextLine().trim().toLowerCase();
        boolean electronic_toll_tag = input.equals("y");

        // want a gps
        System.out.print("want an electronic GPS at $2.95/day (y/n)");
        String gps_input = scanner.nextLine().trim().toLowerCase();
        boolean gps = input.equals("y");

        //roadside assistance
        System.out.print("want roadside assistance at $3.95/da (y/n)");
        String roadside_input = scanner.nextLine().trim().toLowerCase();
        boolean roadside_assistance = input.equals("y");

        //What is your age
        System.out.print("Your Age");
        String age = scanner.nextLine();


        // Summary
        System.out.println("\n===== Rental Summary =====");
        System.out.println("Pickup Date: " + month + "/" + day);
        System.out.println("Days of Rental: " + days_of_rental);
        System.out.println("Electronic Toll Tag: " + (electronic_toll_tag ? "Yes" : "No"));
        System.out.println("GPS: " + (gps ? "Yes" : "No"));
        System.out.println("Roadside Assistance: " + (roadside_assistance ? "Yes" : "No"));
        System.out.println("Driver's Age: " + age);

    }
}