package javaswitch;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number");
		double firstNum = scanner.nextDouble();

		System.out.println("Enter the second number");
		double secondNum = scanner.nextDouble();

		System.out.println("Enter a to add, s to substract , m to multiply and d to divide");
		String calculation = scanner.next();

		String total = "";
		String totalInString = "";
		String statement = "";

		switch (calculation) {
		case "a":
			total = "Sum of two numbers is " + (firstNum + secondNum) + " ";

			break;

		case "s":
			total = "Difference two numbers is " + (firstNum - secondNum) + " ";

			break;

		case "m":
			total = " Product of two numbers is " + (firstNum * secondNum) + " ";

			break;

		case "d":
			total = "Result of division is " + (firstNum / secondNum) + " ";

			break;

		default:
			total = "Wrong input";
		}

		System.out.println(total);
	}

}
