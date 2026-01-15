import java.util.Scanner; // Import the Scanner class to read input

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // Read user input

        if (num % 2 == 0) { // Check if the number is divisible by 2
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        
        scanner.close(); // Close the scanner
    }
}
