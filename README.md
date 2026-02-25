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
using a singly linked list.

This use case demonstrates an advanced palindrome validation
technique by converting a string into a linked list, locating
the middle using fast and slow pointers, reversing the second
half in place, and comparing both halves.

The project strengthens core Java programming fundamentals
and data structure concepts such as:

- Class structure
- main() method
- Static keyword
- Console input using Scanner
- Singly linked list
- Node traversal
- Fast and slow pointer technique
- In-place list reversal
- Logical comparison
- Application flow control
- JavaDoc documentation standards

This implementation covers Use Case 8:
Linked List Based Palindrome Checker.

============================================================

USE CASE 8: LINKED LIST BASED PALINDROME CHECKER

At this stage, the application:

- Accepts user input from the console
- Converts the input string into a singly linked list
- Uses fast and slow pointers to find the middle of the list
- Reverses the second half of the linked list in place
- Compares the first and second halves
- Displays whether the string is a palindrome or not

============================================================

KEY CONCEPTS USED

- **Singly Linked List** – A dynamic data structure using node references
- **Node Traversal** – Sequential access using next pointers
- **Fast and Slow Pointer Technique** – Efficient middle detection
- **In-Place Reversal** – Reverses the list without extra memory
- **Logical Comparison** – Validates palindrome by matching node values

============================================================

DATA STRUCTURE USED

- Singly Linked List

============================================================

TECHNOLOGIES USED

- Java
- IntelliJ IDEA
- Command Line Interface (CLI)

============================================================

PROJECT STRUCTURE

PalindromeCheckerApp/
|
|-- UseCase8PalindromeCheckerApp.java
|-- README.md

============================================================

▶ HOW TO COMPILE AND RUN THE PROGRAM

Step 1: Open Command Prompt

Step 2: Navigate to the project folder

Example:
cd Desktop\PalindromeCheckerApp

Step 3: Compile the program

javac UseCase8PalindromeCheckerApp.java

Step 4: Run the program

java UseCase8PalindromeCheckerApp

============================================================

EXPECTED OUTPUT

When the program is executed, it checks whether the given
string is a palindrome using singly linked list logic.

Example 1:

Input:
Enter a string: refer

Output:
Palindrome

------------------------------------------------------------

Example 2:

Input:
Enter a string: linkedlist

Output:
Not a Palindrome

============================================================