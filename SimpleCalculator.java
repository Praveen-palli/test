import java.util.Scanner; // Import Scanner class for user input

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform the addition
        double result = num1 + num2;
        
        // Output the result of the addition
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        
        // Close the scanner object to free resources
        scanner.close();
    }
}
