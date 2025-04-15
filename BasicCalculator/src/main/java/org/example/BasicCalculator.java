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
        
        // Perform the calculation based on the user's selection
        float result = 0;
        char operation = ' ';
        
        if (option.equalsIgnoreCase("A") || option.equalsIgnoreCase("add")) {
            result = firstNumber + secondNumber;
            operation = '+';
        } else if (option.equalsIgnoreCase("S") || option.equalsIgnoreCase("subtract")) {
            result = firstNumber - secondNumber;
            operation = '-';
        } else if (option.equalsIgnoreCase("M") || option.equalsIgnoreCase("multiply")) {
            result = firstNumber * secondNumber;
            operation = '*';
        } else if (option.equalsIgnoreCase("D") || option.equalsIgnoreCase("divide")) {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                operation = '/';
            } else {
                System.out.println("Error: Cannot divide by zero");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid option selected");
            scanner.close();
            return;
        }
        
        // Display the result
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
        
        scanner.close();
    }
} 
