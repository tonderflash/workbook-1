package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please select the size of the sandwich (1 or 2): ");
        String size_input = scanner.nextLine().trim().toLowerCase();
        
        // Determine the base price based on size
        double basePrice = 0;
        if (size_input.equals("1")) {
            basePrice = 5.45; 
        } else if (size_input.equals("2")) {
            basePrice = 8.95; 
        } else {
            System.out.println("Invalid size");
            scanner.close();
            return;
        }
        
        // Ask if they want a loaded sandwich
        System.out.print("Would you like your sandwich loaded (double everything)? (yes/no): ");
        String loaded_input = scanner.nextLine().trim().toLowerCase();
        
        // Add additional cost for loaded sandwiches
        double additionalCost = 0;
        if (loaded_input.equals("yes") || loaded_input.equals("y")) {
            if (size_input.equals("1")) {
                additionalCost = 1.00;
            } else if (size_input.equals("2")) {
                additionalCost = 1.75;
            }
        }
        
        // Calculate subtotal before discounts
        double subtotal = basePrice + additionalCost;
        
        // Ask for age
        System.out.print("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine().trim());
        
        // Calculate discount based age
        double discount = 0;
        if (age <= 17) {
            discount = 0.1; // 10% 
        } else if (age >= 65) {
            discount = 0.2; // 20%
        }
        
  
        double finalPrice = subtotal * (1 - discount);
        
        // Result
        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);
        
        scanner.close();
    }
}
