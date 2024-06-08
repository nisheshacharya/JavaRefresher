package conditionalStatement;

import java.util.Scanner;

public class DetectNegative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number andI will tell if the number is negative: ");
		
		System.out.println("Enter the number: ");
		int inputNumber = scanner.nextInt();
		
		if(inputNumber > 0) {
			System.out.println("The number is greater than 0, hence positive.");
		}else if(inputNumber < 0) {
			System.out.println("The number is smaller than 0, hence negative.");
		}else {
			System.out.println("The number is 0. It is neither positive nor negative.");
		}
	}
}
