import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String input = scanner.nextLine(); // read user input

        System.out.println("You entered: " + input);

        scanner.close();
    }
}
