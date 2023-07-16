package org.Cheating;
import java.util.Scanner;

public class Check3 {
    public static void main(String[] args) {
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

        System.out.println("Converted query: ");
        System.out.println(convertedQuery);
        scanner.close();
    }

}
//SELECT TOP 10 TestRunDetails.TestName, TestRunDetails.IterationStartTime, TestRunDetails.IterationEndTime, TestRunDetails.Iteration, DeploymentMetadata.DeploymentName, TestInfraMetadata.WorkloadName, CASE WHEN DATEDIFF(MINUTE, TestRunDetails.IterationStartTime, TestRunDetails.IterationEndTime) > 45 THEN 'Breach' ELSE 'No Breach' END AS Status FROM TestRunDetails INNER JOIN DeploymentMetadata ON TestRunDetails.DeploymentID = DeploymentMetadata.DeploymentID INNER JOIN TestInfraMetadata ON TestRunDetails.WorkloadID = TestInfraMetadata.WorkloadID WHERE TestRunDetails.IterationStartTime = (SELECT MAX(IterationStartTime) FROM TestRunDetails) AND TestRunDetails.IterationStartTime >= '2023-05-23' ORDER BY TestRunDetails.TestName
//SELECT TOP 10TestRunDetails.TestName,TestRunDetails.IterationStartTime,TestRunDetails.IterationEndTime,TestRunDetails.Iteration,DeploymentMetadata.DeploymentName,TestInfraMetadata.WorkloadName,CASE WHEN DATEDIFF(MINUTE, TestRunDetails.IterationStartTime, TestRunDetails.IterationEndTime) > 45 THEN 'Breach' ELSE 'No Breach' END AS StatusFROMTestRunDetailsINNER JOINDeploymentMetadata ON TestRunDetails.DeploymentID = DeploymentMetadata.DeploymentIDINNER JOINTestInfraMetadata ON TestRunDetails.WorkloadID = TestInfraMetadata.WorkloadIDWHERETestRunDetails.IterationStartTime = (SELECT MAX(IterationStartTime) FROM TestRunDetails)AND TestRunDetails.IterationStartTime >= '2023-05-23'ORDER BYTestRunDetails.TestName

