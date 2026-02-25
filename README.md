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
while ignoring spaces and case differences.

This use case demonstrates string preprocessing techniques
such as normalization using regular expressions and applying
previous palindrome validation logic on the processed input.

The project strengthens core Java programming fundamentals
and string handling concepts such as:

- Class structure
- main() method
- Static keyword
- Console input using Scanner
- String preprocessing
- Regular expressions
- Case normalization
- Two-pointer comparison technique
- Application flow control
- JavaDoc documentation standards

This implementation covers Use Case 10:
Case-Insensitive & Space-Ignored Palindrome Checker.

============================================================

USE CASE 10: CASE-INSENSITIVE & SPACE-IGNORED PALINDROME CHECKER

At this stage, the application:

- Accepts user input from the console
- Removes all spaces using regular expressions
- Converts characters to lowercase
- Applies palindrome checking logic on normalized string
- Displays whether the string is a palindrome or not

============================================================

KEY CONCEPTS USED

- **String Preprocessing** – Cleaning and normalizing input data
- **Regular Expressions** – Removing spaces from the string
- **Case Normalization** – Converting characters to lowercase
- **Logical Comparison** – Validating palindrome after preprocessing

============================================================

DATA STRUCTURE USED

- String / Array

============================================================

TECHNOLOGIES USED

- Java
- IntelliJ IDEA
- Command Line Interface (CLI)

============================================================

PROJECT STRUCTURE

PalindromeCheckerApp/
|
|-- UseCase10PalindromeCheckerApp.java
|-- README.md

============================================================

▶ HOW TO COMPILE AND RUN THE PROGRAM

Step 1: Open Command Prompt

Step 2: Navigate to the project folder

Example:
cd Desktop\PalindromeCheckerApp

Step 3: Compile the program

javac UseCase10PalindromeCheckerApp.java

Step 4: Run the program

java UseCase10PalindromeCheckerApp

============================================================

EXPECTED OUTPUT

When the program is executed, it ignores spaces and case
while validating whether the given string is a palindrome.

Example 1:

Input:
Enter a string: Never Odd Or Even

Output:
Palindrome

------------------------------------------------------------

Example 2:

Input:
Enter a string: Hello World

Output:
Not a Palindrome

============================================================