import java.util.Scanner;

public class AverageFiveNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        int number;      // Variable to store each entered number
        int sum = 0;     // Variable to store the total sum

        // Ask the user to enter five integers
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            number = scanner.nextInt();
            sum = sum + number;
        }

        // Calculate and display the average
        double average = (double) sum / 5;
        System.out.println("The average is: " + average);

        // Close the scanner
        scanner.close();
    }
}
