package revision;

import java.util.Scanner;

public class Revision_Main {


    public static void main(String[] args) {
//        swapNumbers();
//        findMinimum();
//        calculator();
//        multiTable();
//        sumOfEven();
//        findFactorial();
//        System.out.println(isFibonacci(5, 0, 1));
       printFibonacci();


    }


    public static void swapNumbers() {
        Scanner sacnner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = sacnner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = sacnner.nextInt();

        System.out.println("First number:" + firstNumber);
        System.out.println("Second number:" + secondNumber);

        System.out.println("Press 'y' and enter to swap the number");
        String anyKey = sacnner.next();

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("New first number: " + firstNumber + "  New second number: " + secondNumber);
        System.out.println("_______________________________________________________________________");
        System.out.println(" ");

    }

    public static void findMinimum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me three numbers, I will find the smallest.");

        System.out.println("Enter first number");
        int firstNum = scanner.nextInt();

        System.out.println("Enter Second number");
        int secondNum = scanner.nextInt();

        System.out.println("Enter third number");
        int thirdNum = scanner.nextInt();

        int minimum;

        if (firstNum < secondNum) {
            if (firstNum < thirdNum) {
                minimum = firstNum;
            } else {
                minimum = thirdNum;
            }
        } else {
            if (secondNum < thirdNum) {
                minimum = secondNum;
            } else {
                minimum = thirdNum;
            }
        }

        System.out.println("Smallest number is " + minimum);

        System.out.println("_______________________________________________________________________");
        System.out.println(" ");

    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        String output;

        System.out.println("Mini calculator");

        System.out.println("Enter the first number");
        int firstNum = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNum = scanner.nextInt();

        System.out.println("Type 'A' for addition, 'S' For subtraction, 'M' for multiplication and 'D' for division: ");
        String choice = scanner.next().toUpperCase();

        switch (choice) {
            case "A":
                output = "The sum is " + (firstNum + secondNum);
                break;

            case "S":
                output = "The difference is " + (firstNum - secondNum);
                break;

            case "D":
                output = "The first number divided by second number is " + (firstNum / secondNum);
                break;

            case "M":
                output = "The product of two numbers is " + (firstNum * secondNum);
                break;

            default:
                output = "Wrong input";
                break;
        }
        System.out.println(output);

        System.out.println("_______________________________________________________________________");
        System.out.println(" ");
    }

    public static void multiTable() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Press enter to get the multiplication table of 13");
        String blank = scan.nextLine().trim();
        if (blank.equals("")) {
            int number = 13;
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("");
    }


    public static void sumOfEven() {
        System.out.println("Sum of even numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number. I will give you the sum of even numbers from 0 to that number:");
        int num = scanner.nextInt();
        int total = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("Sum of even numbers till " + num + " is " + total);

        System.out.println(" ___________________________________________________________");
        System.out.println(" ");
    }

    public static void findFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);

        System.out.println(" ");
        System.out.println(" ");
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    // Fibonacci Sequence

    public static void printFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Fibonacci number to to print the Fibonacci sequence");
        int num = scanner.nextInt();
        if (isFibonacci(num, 0, 1)) {
            String fibonacciString = getFibonacciSequence(num, 0, 1);
            System.out.println(fibonacciString);

        } else {
            System.out.println(num + " is not a Fibonacci number.");
        }

    }

    public static boolean isFibonacci(int n, int i, int j) {
        if (n == i) {
            return true;
        }
        if (n < i) {
            return false;
        } else {
            return isFibonacci(n, j, j + i);
        }
    }

    public static String getFibonacciSequence(int n, int j, int k) {

            if (n == j) {
                return j + " ";
            } else return (j + " ") + getFibonacciSequence(n, k, k + j);
        }
    }



