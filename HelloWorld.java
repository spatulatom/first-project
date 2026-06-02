import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner that reads what the user types in the terminal.
        Scanner input = new Scanner(System.in);

        // Ask for the user's name and read the full line of text.
        System.out.print("What is your name? ");
        String name = input.nextLine();

        // Ask for the user's age and read it as an integer number.
        System.out.print("How old are you? ");
        int age = input.nextInt();

        // Print a response using the values entered by the user.
        System.out.println("Hi " + name + "! You are " + age + " years old.");

        // Close the Scanner when finished reading input.
        input.close();
    }

    // FUNCTION 1: Demonstrates using parameters and return values.
    // This method checks if someone is an adult and returns a boolean (true/false).
    // Parameters: takes an integer age as input
    // Return type: boolean - methods can return different types, not just void
    // (which returns nothing)
    public static boolean isAdult(int age) {
        // Conditional statement: if age is 18 or older, return true. Otherwise return
        // false.
        if (age >= 18) {
            return true; // Exit the function immediately and send back true
        } else {
            return false; // Exit the function immediately and send back false
        }
        // Simpler way to write this: return age >= 18;
    }

    // FUNCTION 2: Demonstrates loops and String manipulation.
    // This method repeats a string a certain number of times and prints it.
    // Parameters: takes a String and an integer (how many times to repeat)
    // Return type: void - this method doesn't return any value, it just prints
    // output
    public static void repeatString(String text, int times) {
        // Loop: a for loop repeats code a specific number of times
        // The variable 'i' starts at 0 and increases by 1 each time, until it reaches
        // 'times'
        for (int i = 0; i < times; i++) {
            System.out.println("Repeat " + (i + 1) + ": " + text);
        }
    }
}
