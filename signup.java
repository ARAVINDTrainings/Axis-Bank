import java.util.Scanner; // Import the Scanner class to read user input

public class InteractiveDemo {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your favorite number: ");
        int number = scanner.nextInt();
        
        // Conditional Logic
        if (number > 0) {
            System.out.println("\nHello, " + name + "! Let's count up to " + number + ":");
            
            // Loop execution
            for (int i = 1; i <= number; i++) {
                System.out.println("Counting: " + i);
            }
        } else {
            System.out.println("\nHello, " + name + "! You picked a number that is 0 or negative.");
        }
        
        // Close the scanner resource
        scanner.close();
    }
}

