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
using a Deque (Double Ended Queue).

This use case demonstrates an optimized palindrome checking
approach by directly comparing characters from the front and
rear of the deque without using separate reversal structures.

The project strengthens core Java programming fundamentals
and advanced data structure concepts such as:

- Class structure
- main() method
- Static keyword
- Console input using Scanner
- Deque data structure
- Front and rear access
- Optimized data handling
- Logical comparison
- Application flow control
- JavaDoc documentation standards

This implementation covers Use Case 7:
Deque-Based Optimized Palindrome Checker.

============================================================

USE CASE 7: DEQUE-BASED OPTIMIZED PALINDROME CHECKER

At this stage, the application:

- Accepts user input from the console
- Inserts characters into a Deque
- Removes characters from both front and rear
- Compares characters directly without reversal
- Determines whether the string is a palindrome
- Displays the result

============================================================

KEY CONCEPTS USED

- **Deque (Double Ended Queue)** – Allows insertion and deletion from both front and rear
- **Front and Rear Access** – Enables direct comparison of first and last characters
- **Optimized Data Handling** – Eliminates the need for extra reversal data structures
- **Logical Comparison** – Efficient palindrome validation

============================================================

DATA STRUCTURE USED

- Deque

============================================================

TECHNOLOGIES USED

- Java
- IntelliJ IDEA
- Command Line Interface (CLI)

============================================================

PROJECT STRUCTURE

PalindromeCheckerApp/
|
|-- UseCase7PalindromeCheckerApp.java
|-- README.md

============================================================

▶ HOW TO COMPILE AND RUN THE PROGRAM

Step 1: Open Command Prompt

Step 2: Navigate to the project folder

Example:
cd Desktop\PalindromeCheckerApp

Step 3: Compile the program

javac UseCase7PalindromeCheckerApp.java

Step 4: Run the program

java UseCase7PalindromeCheckerApp

============================================================

EXPECTED OUTPUT

When the program is executed, it compares characters from
the front and rear of the deque to validate palindrome logic.

Example 1:

Input:
Enter a string: racecar

Output:
Palindrome

------------------------------------------------------------

Example 2:

Input:
Enter a string: deque

Output:
Not a Palindrome

============================================================