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
using both Queue and Stack data structures.

This use case demonstrates the behavioral difference between
FIFO (First In First Out) and LIFO (Last In First Out) data
structures and how they can be used together to validate
palindrome logic.

The project strengthens core Java programming fundamentals
and data structure concepts such as:

- Class structure
- main() method
- Static keyword
- Console input using Scanner
- Queue data structure (FIFO)
- Stack data structure (LIFO)
- Enqueue and Dequeue operations
- Push and Pop operations
- Logical comparison
- Application flow control
- JavaDoc documentation standards

This implementation covers Use Case 6:
Queue + Stack Based Palindrome Check.

============================================================

USE CASE 6: QUEUE + STACK BASED PALINDROME CHECK

At this stage, the application:

- Accepts user input from the console
- Enqueues characters into a Queue (FIFO)
- Pushes characters into a Stack (LIFO)
- Compares dequeue output with pop output
- Validates palindrome based on character matching
- Displays whether the string is a palindrome or not

============================================================

KEY CONCEPTS USED

- **Queue** – A linear data structure that follows the FIFO principle
- **Enqueue & Dequeue Operations** – Used to insert and remove elements from the queue
- **Stack** – A linear data structure that follows the LIFO principle
- **Push & Pop Operations** – Used to insert and remove elements from the stack
- **Stack vs Queue** – Demonstrates behavioral differences between LIFO and FIFO
- **Logical Comparison** – Matching dequeue and pop values for palindrome validation

============================================================

DATA STRUCTURES USED

- Queue
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
|-- UseCase6PalindromeCheckerApp.java
|-- README.md

============================================================

▶ HOW TO COMPILE AND RUN THE PROGRAM

Step 1: Open Command Prompt

Step 2: Navigate to the project folder

Example:
cd Desktop\PalindromeCheckerApp

Step 3: Compile the program

javac UseCase6PalindromeCheckerApp.java

Step 4: Run the program

java UseCase6PalindromeCheckerApp

============================================================

EXPECTED OUTPUT

When the program is executed, it compares characters using
Queue (FIFO) and Stack (LIFO) to validate palindrome logic.

Example 1:

Input:
Enter a string: radar

Output:
Palindrome

------------------------------------------------------------

Example 2:

Input:
Enter a string: queue

Output:
Not a Palindrome

============================================================