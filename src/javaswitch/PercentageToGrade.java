package javaswitch;

import java.util.Scanner;

public class PercentageToGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the percentage to convert into grade: ");
		int percentage = scanner.nextInt();
		
		String grade;
		switch( percentage/10) {
		case 10:
			grade = "A+";
			break;
		case 9:
			grade= "A";
			break;
		case 8:
			grade = "B+";
			break;
		case 7:
			grade= "B";
			break;
		case 6:
			grade = "C+";
			break;
		case 5:
			grade= "C";
			break;
		case 4:
			grade = "D+";
			break;
		case 3:
			grade= "D";
			break;
		default:
			grade = "F";
			break;
		
		}
		System.out.println(" Your grade is "+ grade +".");
	}

}
