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

    // FUNCTION 3: Demonstrates arrays and calculations.
    // This method calculates the average of numbers in an array.
    // Parameters: takes an array of integers
    // Return type: double - this returns a decimal number
    public static double calculateAverage(int[] numbers) {
        // Guard clause: check if array is empty to avoid division by zero
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        // Enhanced for loop: iterates through each element in the array
        for (int num : numbers) {
            sum += num; // Add each number to the sum
        }
        // Cast the sum to double to get a decimal result
        return (double) sum / numbers.length;
    }

    // FUNCTION 4: Demonstrates while loop and user validation.
    // This method validates that a number is within a certain range.
    // Parameters: takes an integer to validate
    // Return type: boolean - true if valid, false otherwise
    public static boolean isValidScore(int score) {
        // A while loop could be used here, but let's keep it simple with a condition
        while (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100!");
            return false;
        }
        return true;
    }

    // FUNCTION 5: Demonstrates switch statement for day of week.
    // This method returns the name of a day based on a number.
    // Parameters: takes an integer representing day of week (1-7)
    // Return type: String - the name of the day
    public static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day number (use 1-7)";
        }
    }

    // FUNCTION 6: Demonstrates string manipulation.
    // This method counts how many times a character appears in a string.
    // Parameters: takes a String and a character to search for
    // Return type: int - the count of occurrences
    public static int countCharacter(String text, char letter) {
        int count = 0;
        // Convert string to array of characters and iterate through them
        for (char c : text.toCharArray()) {
            if (c == letter) {
                count++; // Increment count when we find a match
            }
        }
        return count;
    }

    // FUNCTION 7: Demonstrates method overloading (same name, different
    // parameters).
    // This is another version of repeatString that takes an integer instead of a
    // String.
    // Java allows multiple methods with the same name as long as the parameters are
    // different.
    public static void repeatString(int number, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Repeat " + (i + 1) + ": " + number);
        }
    }

    // FUNCTION 8: Demonstrates nested loops and pattern creation.
    // This method prints a simple pattern (pyramid).
    // Parameters: takes an integer for the height of the pyramid
    // Return type: void - just prints output
    public static void printPyramid(int height) {
        for (int row = 1; row <= height; row++) {
            // Inner loop: print spaces for indentation
            for (int space = 0; space < height - row; space++) {
                System.out.print(" ");
            }
            // Inner loop: print stars
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
