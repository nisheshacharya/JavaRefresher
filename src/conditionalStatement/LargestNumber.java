package conditionalStatement;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: " );
		int firstNumber = scanner.nextInt(); 
		
		System.out.println("Enter the second number: " );
		int secondNumber = scanner.nextInt(); 
		
		System.out.println("Enter the third number: " );
		int thirdNumber = scanner.nextInt(); 
		
		int largestNumber; 
		if(firstNumber> secondNumber ) {
			if(firstNumber> thirdNumber) {
				largestNumber = firstNumber;
			}else {
				largestNumber = thirdNumber; 
			}
		}else {
			if(secondNumber>thirdNumber) {
				largestNumber = secondNumber;
			}else {
				largestNumber = thirdNumber;
			}
		}
		System.out.println("Largest number is "+ largestNumber + " .");
		
	}
	
}
