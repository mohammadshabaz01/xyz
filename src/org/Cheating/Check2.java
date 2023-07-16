package org.Cheating;

import java.util.Scanner;

public class Check2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\A");

        System.out.println("Enter the SQL query:");
        String query = scanner.next();

        // Remove line breaks and extra spaces from the query
        query = query.replaceAll("\\s+", " ");

        // Store the query in a String variable
        String convertedQuery = query;

        System.out.println("Converted query: ");
        System.out.println(convertedQuery);
    }
}
