import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using loop
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}