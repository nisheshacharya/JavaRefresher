package conditionalStatement;
import java.util.Scanner;

public class AgeCheck {
	
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Are you elegible to enter? Input your age:");
	int age = scan.nextInt();
	
	if(age>=18) {
		System.out.println("You can join us!");
	}else {
		System.out.println("You are "+ age +". You need to be 18 to join the club.");
	}
	
}

}
