package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        System.out.print("First Name: ");
        String firstName = nameScanner.nextLine().trim();

        System.out.print("Middle Name: ");
        String middleName = nameScanner.nextLine().trim();

        System.out.print("Last Name: ");
        String lastName = nameScanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = nameScanner.nextLine().trim();

        String output = firstName;

        if (!middleName.isEmpty()) {
            output = output.concat(" " + middleName);
        }
        output = output.concat(" " + lastName);

        if (!suffix.isEmpty()) {
            output = output.concat(" " + suffix);
        }

        System.out.println(output);
    }
}



