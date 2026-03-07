import java.util.Scanner;

public class PalindroneCheckerApp {

    // Method 1: Reverse String Method
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Method 2: Two Pointer Method
    public static boolean twoPointerMethod(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Two Pointer Method Timing
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long end2 = System.nanoTime();

        System.out.println("\nReverse Method Result: " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nTwo Pointer Method Result: " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        sc.close();
    }
}