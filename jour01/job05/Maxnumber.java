import java.util.Scanner;

public class Maxnumber {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Find the maximum of the three numbers
        double max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        // Display the result
        System.out.println("The maximum number is: " + max);

        // Close the scanner
        scanner.close();
    }
}