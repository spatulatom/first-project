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
}
