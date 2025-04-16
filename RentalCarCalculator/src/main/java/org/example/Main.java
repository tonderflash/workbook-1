package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){

        final double BASIC_RATE_PER_DAY = 29.99;
        final double UNDERAGE_SURCHARGE = 0.30;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Car Rental Calculator =====");

        // Collect basic information
        System.out.print("Pickup month (1-12): ");
        String month = scanner.nextLine();

        System.out.print("Pickup day (1-31): ");
        String day = scanner.nextLine();

        System.out.print("Number of rental days: ");
        int rentalDays = Integer.parseInt(scanner.nextLine());

        // Additional options
        System.out.print("Do you want an electronic toll tag for $3.95/day? (y/n): ");
        String tollInput = scanner.nextLine().trim().toLowerCase();
        boolean electronicTollTag = tollInput.equals("y");

        System.out.print("Do you want a GPS for $2.95/day? (y/n): ");
        String gpsInput = scanner.nextLine().trim().toLowerCase();
        boolean gps = gpsInput.equals("y");

        System.out.print("Do you want roadside assistance for $3.95/day? (y/n): ");
        String roadsideInput = scanner.nextLine().trim().toLowerCase();
        boolean roadsideAssistance = roadsideInput.equals("y");

        // drivers age
        System.out.print("Driver's age: ");
        int driverAge = Integer.parseInt(scanner.nextLine());

        // calculations
        double basicCost = BASIC_RATE_PER_DAY * rentalDays;
        
        // calculate options cost
        double optionsCost = 0;
        if (electronicTollTag) {
            optionsCost += 3.95 * rentalDays;
        }
        if (gps) {
            optionsCost += 2.95 * rentalDays;
        }
        if (roadsideAssistance) {
            optionsCost += 3.95 * rentalDays;
        }
        
        // ccalculate underage surcharge
        double underageSurcharge = 0;
        if (driverAge < 25) {
            underageSurcharge = basicCost * UNDERAGE_SURCHARGE;
        }
        
        // calculate total cost
        double totalCost = basicCost + optionsCost + underageSurcharge;

        //display summary
        System.out.println("\n===== Rental Summary =====");
        System.out.println("Pickup date: " + month + "/" + day);
        System.out.println("Rental days: " + rentalDays);
        System.out.println("Driver's age: " + driverAge);
        
        System.out.println("\n===== Cost Breakdown =====");
        System.out.println("Basic car rental (" + rentalDays + " days × " + (BASIC_RATE_PER_DAY) + "/day): " + (basicCost));
        
        // Display selected options
        if (electronicTollTag || gps || roadsideAssistance) {
            System.out.println("Additional options:");
            if (electronicTollTag) {
                System.out.println("  - Electronic toll tag: " + (3.95 * rentalDays));
            }
            if (gps) {
                System.out.println("  - GPS: " + (2.95 * rentalDays));
            }
            if (roadsideAssistance) {
                System.out.println("  - Roadside assistance: " + (3.95 * rentalDays));
            }
            System.out.println("Total options cost: " + (optionsCost));
        } else {
            System.out.println("Additional options: None");
        }
        
        // Display age surcharge
        if (driverAge < 25) {
            System.out.println("Underage driver surcharge (30%): " + (underageSurcharge));
        } else {
            System.out.println("Underage driver surcharge: Not applicable");
        }
        
        System.out.println("\nTOTAL COST: " + (totalCost));
        
        scanner.close();
    }
}
