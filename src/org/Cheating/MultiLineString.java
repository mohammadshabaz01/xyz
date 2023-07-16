package org.Cheating;
import java.util.Scanner;

public class MultiLineString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter multiple lines of text (Enter 'done' to finish):");

        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while (true) {
            line = scanner.nextLine();

            if (line.equals("done")) {
                break;
            }

            stringBuilder.append(line);
            //stringBuilder.append(System.lineSeparator());
            stringBuilder.append(" ");
        }

        String combinedString = stringBuilder.toString();

        System.out.println("Combined string:"+ combinedString);
       
        scanner.close();
    }
}
