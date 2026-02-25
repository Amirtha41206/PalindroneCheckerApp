# Palindrome Checker App

============================================================

PROJECT TITLE:
Palindrome Checker Application

VERSION:
1.0

AUTHOR:
Amirtha S S

============================================================

PROJECT DESCRIPTION

The Palindrome Checker App is a console-based Java application
designed to validate whether a given string is a palindrome
using a stack-based approach.

This implementation uses the LIFO (Last In First Out) property
of the Stack data structure to reverse the string and compare
it with the original input.

The project strengthens core Java programming fundamentals
and data structure concepts such as:

- Class structure
- main() method
- Static keyword
- Console input using Scanner
- Stack data structure
- Push and Pop operations
- Looping constructs
- String comparison using equals()
- Application flow control
- JavaDoc documentation standards

This implementation covers Use Case 5:
Stack-Based Palindrome Checker.

============================================================

USE CASE 5: STACK-BASED PALINDROME CHECKER

At this stage, the application:

- Accepts user input from the console
- Pushes each character of the string into a stack
- Pops characters from the stack to reverse the string
- Compares the original and reversed strings
- Displays whether the string is a palindrome or not

============================================================

KEY CONCEPTS USED

- **Stack** – A linear data structure that follows the Last In First Out (LIFO) principle
- **Push Operation** – Used to insert characters into the stack
- **Pop Operation** – Used to remove characters from the stack in reverse order
- **Reversal Logic** – Stack naturally reverses the order of elements
- **String Comparison** – equals() method for content comparison

============================================================

DATA STRUCTURE USED

- Stack

============================================================

TECHNOLOGIES USED

- Java
- IntelliJ IDEA
- Command Line Interface (CLI)

============================================================

PROJECT STRUCTURE

PalindromeCheckerApp/
|
|-- UseCase5PalindromeCheckerApp.java
|-- README.md

============================================================

▶ HOW TO COMPILE AND RUN THE PROGRAM

Step 1: Open Command Prompt

Step 2: Navigate to the project folder

Example:
cd Desktop\PalindromeCheckerApp

Step 3: Compile the program

javac UseCase5PalindromeCheckerApp.java

Step 4: Run the program

java UseCase5PalindromeCheckerApp

============================================================

EXPECTED OUTPUT

When the program is executed, it prompts the user to enter a string
and validates whether the string is a palindrome using stack-based
reversal logic.

Example 1:

Input:
Enter a string: madam

Output:
Palindrome

------------------------------------------------------------

Example 2:

Input:
Enter a string: stack

Output:
Not a Palindrome

============================================================