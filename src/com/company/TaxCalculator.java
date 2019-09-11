package com.company;
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

            if (salary < 50000) {
                int tax = 5 / 100 * salary;
                System.out.println("Your tax is: " + tax);
            } else if (salary < 200000) {
                int tax = 10 / 100 * salary;
                System.out.println("Your tax is: " + tax);
            } else if (salary > 200000) {
                int tax = 15 / 100 * salary;
                System.out.println("Your tax is: " + tax);
            }

        }
    }
