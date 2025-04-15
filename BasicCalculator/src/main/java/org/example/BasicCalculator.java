package org.example;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the first number
        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        
        // Ask for the second number
        System.out.print("Enter the second number: ");
        float secondNumber = scanner.nextFloat();
        
        // Show calculation options
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        
        // Ask the user for an option
        System.out.print("Please select an option: ");
        scanner.nextLine(); // Consume the newline after the number
        String option = scanner.nextLine();
        
        // For this exercise, we always multiply regardless of the selected option
        float result = firstNumber * secondNumber;
        
        // Display the result
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        
        scanner.close();
    }
} 
