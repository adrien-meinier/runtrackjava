import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their first name
        System.out.print("Enter your first name: ");
        
        // Read the full line entered by the user and store it in a variable
        String firstName = scanner.nextLine();

        // Display a greeting message using the entered name
        System.out.println("Hello " + firstName);

        // Close the scanner to free system resources
        scanner.close();
    }
}
