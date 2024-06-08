package loops;

import java.util.Scanner;

public class MakePalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to find the longest palindrom out of it: ");
		String word = scan.next();
		
		makePalindrom(word);
		
	}
	static String  makePalindrom(String word) {
		
		String begining ="";
		String end ="";
		String newWord = ""; 
		
		int i = 0;
		int j = word.length()-1;
		
		while(i<= j) {
			
			if(i != j) {
			begining = begining + String.valueOf(word.charAt(i));
			end = String.valueOf(word.charAt(j))+ end;
			
			if(word.charAt(i) == word.charAt(j)) {
				newWord = begining+ end; 	
			}
			}else if (i == j){
				begining = begining + String.valueOf(word.charAt(i));
				newWord = begining + end; 
				
			}
//			begining = "";
//			end = ""; 
			
			i++; 
			j--;
		}
		System.out.println("Longest palindrom in the word is: "+ newWord);
		return newWord;
		
	}

}
