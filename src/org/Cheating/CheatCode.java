package org.Cheating;
import java.util.Arrays;
import java.util.Scanner;


public class CheatCode {
	// this method is for to make the query in a single String variable.
	public static String queryString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the SQL query (terminate with 'END' on a new line):");
        StringBuilder input = new StringBuilder();
        String line;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }
            input.append(line);
            input.append(System.lineSeparator());
        }
        String query = input.toString();

        // Remove line breaks and extra spaces from the query
        query = query.replaceAll("\\s+", " ");

        // Store the query in a String variable
        String convertedQuery = query;

        System.out.println("Converted query 1st method: ");
        System.out.println(convertedQuery);
        scanner.close();
        return convertedQuery;
    }

    public static void main(String[] args) {
        
        String sqlQuery = queryString();
        System.out.println("given Query is "+ sqlQuery);
        // Storing the SQL query in a string variable
        String fullQuery = sqlQuery.trim();

        // Splitting the SQL query into multiple blocks
        int selectIndex = fullQuery.toUpperCase().indexOf("SELECT");
        int fromIndex = fullQuery.toUpperCase().indexOf("FROM");
        int whereIndex = fullQuery.toUpperCase().indexOf("WHERE");
        int orderByIndex = fullQuery.toUpperCase().indexOf("ORDER BY");
 
        String selectBlock = fullQuery.substring(selectIndex + "SELECT".length(), fromIndex).trim();
        String fromBlock = fullQuery.substring(fromIndex + "FROM".length(), whereIndex).trim();
        String whereBlock = fullQuery.substring(whereIndex + "WHERE".length(),orderByIndex).trim();
        String orderByBlock = fullQuery.substring(orderByIndex + "ORDER BY".length()).trim();

        // printing the separated blocks
        System.out.println("Set of column's contain Select Block is : " + selectBlock);
        System.out.println("Table in From Block is : " + fromBlock);
        System.out.println("Condition for Where Block is : " + whereBlock);
        System.out.println("condition for Order By Block is "+ orderByBlock);
        //Now converting into respective array's
        String[] select =selectBlock.split(", ");
        System.out.println("Array of Select block is "+Arrays.toString(select));
        //System.out.println(select[1]);
        
        //Array for From block
        String[] from =fromBlock.split(" ");
        System.out.println("Array of From block is "+Arrays.toString(from));
        
        //Array for Where Block
        String[] where =whereBlock.split(" ");
        System.out.println("Array of Where block is "+Arrays.toString(where));
        
      //Array for Order By Block
        String[] orderBy =orderByBlock.split(" ");
        System.out.println("Array of Order By block is "+Arrays.toString(orderBy));
    }
}
