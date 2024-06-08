package loops;

import java.util.Scanner;

public class CheckPalimdrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word or number to check if it is a palindrome.");
		String word = scan.next();
		
		checkPalindrome(word);
		
	}
	
	static void checkPalindrome(String word) {
		boolean isPalindrome = true; 
		int i = 0;
		while(i< (word.length()-1)/2) {
			if(word.charAt(i)!= word.charAt(word.length()-1 -i)) {
				isPalindrome = false;
				break;
			}
			i++;
		}
		System.out.println(isPalindrome);
	}

}
