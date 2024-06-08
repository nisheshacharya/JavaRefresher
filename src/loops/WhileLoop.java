package loops;

import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number to chek if it is a prime number");
	int number = scanner.nextInt();
	
	checkPrime(number);
	
}
static void checkPrime(int number) {
	boolean isPrime = true;
	int i = 2;
	if(number <2) {
		isPrime = false;
	}
	else {
	while(i<= number/2){
		if(number % i == 0) {
			isPrime = false;
		}
		i++;
	}
	}
	
	if(isPrime) {
		System.out.println("Number is prime");
	}else {
		System.out.println("Number is not a prime");
	}
}
}
