package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for employee name
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        // Ask for hours worked
        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();
        
        // Ask for pay rate
        System.out.print("Enter pay rate: ");
        float payRate = scanner.nextFloat();
        
        // Calculate gross pay with overtime (1.5x after 40 hours)
        float grossPay;
        
        if (hoursWorked <= 40) {
            // No overtime
            grossPay = hoursWorked * payRate;
        } else {
            // With overtime (time and a half after 40 hours)
            float regularHours = 40;
            float overtimeHours = hoursWorked - 40;
            grossPay = (regularHours * payRate) + (overtimeHours * payRate * 1.5f);
        }
        
        
        System.out.println("\nPayment Summary");
        System.out.println("Employee name: " + name);
        System.out.println("Gross pay: $" + String.format("%.2f", grossPay));
        
       
        scanner.close();
    }
}
