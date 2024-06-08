package loops;

import java.util.Scanner;

public class ForLoop {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter any number less than 15: ");
	int number = scanner.nextInt();
	
	sumOfNumbers(number);
	printAllEvenNumbers(number);
	
	System.out.println("-------------------------------------------");
	
	System.out.println("Enter your name: ");
	String name = scanner.next();
	
	reverseString(name);
	
 
}

static void sumOfNumbers(int number) {
	int total = 0;
	for (int i = 1; i<=number ; i++ ) {
		total+= i;
	}
	System.out.println("Sum of natural numbers till "+ number+ " is "+ total + ".");
	 
}
static void printAllEvenNumbers (int number) {
	System.out.println("Even numbers between 0 and "+ number + " are: ");
	for (int i = 0; i<=number ; i=i+2 ) {
		System.out.println(i);
	}
}
static void reverseString(String name) {
	String reversedName = "";
	for(int i = name.length()-1; i>=0;  i--) {
		reversedName += name.charAt(i);
	}
	System.out.println("Reverse of your name will be " + reversedName.toUpperCase());
}
}
