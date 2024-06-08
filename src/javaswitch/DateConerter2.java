package javaswitch;

import java.util.Scanner;

public class DateConerter2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the date in MM-DD-YYYY format");
		String inputDate = scanner.next();
		
		String inputDay;
		String inputYear;
		String inputMonth = inputDate.substring(0,2);
		
		String outputStatement = ""; 
		String monthName = "";
		
		
		if((inputDate.trim().length() == 10) && 
			((inputDate.substring(2,3).equals("-")) || (inputDate.substring(2,3).equals("/"))) &&
			((inputDate.substring(5,6).equals("-")) || (inputDate.substring(5,6).equals("/")))) {
			
			inputDay = inputDate.substring(3,5);
			inputYear = inputDate.substring(6,10);
		}
		else if(inputDate.trim().length()== 8) {
			inputDay = inputDate.substring(2,4);
			inputYear = inputDate.substring(4,8);
			
		}
		else {
			System.out.println("Wrong input. Date should be in MM-DD-YYYY format.");
			return;
		}
		
		switch(inputMonth) {
		case "01":
			outputStatement = " Date is "; 
			monthName = "January";
			
		case "02":
			outputStatement = " Date is "; 
			monthName = "February";
			break;
		case "03":
			outputStatement = " Date is "; 
			monthName = "March";
			break;
		case "04":
			outputStatement = " Date is "; 
			monthName = "April";
			break;
		case "05":
			outputStatement = " Date is "; 
			monthName = "May";
			break;
		case "06":
			outputStatement = " Date is "; 
			monthName = "June";
			break;
		case "07":
			outputStatement = " Date is "; 
			monthName = "July";
			break;
		case "08":
			outputStatement = " Date is "; 
			monthName = "August";
			break;
		case "09":
			outputStatement = " Date is "; 
			monthName = "September";
			break;
		case "10":
			outputStatement = " Date is "; 
			monthName = "October";
			break;
		case "11":
			outputStatement = " Date is "; 
			monthName = "November";
			break;
		case "12":
			outputStatement = " Date is "; 
			monthName = "December";
			break;
			
		default :
			outputStatement = "Wrong input.";
			break;
		}
		if(Integer.parseInt(inputDay) > 31) {
			System.out.println("Wrong input. Day can not be "+ inputDay);
		}
		else if(Integer.parseInt(inputYear) % 4 !=0  && Integer.parseInt(inputMonth) == 02 && Integer.parseInt(inputDay)> 28){
			System.out.println(inputYear + " is not leap year. February can not have 29 days. ");
		}
		else if(Integer.parseInt(inputYear) % 4 ==0  && Integer.parseInt(inputMonth) == 02 && Integer.parseInt(inputDay)> 29 && Integer.parseInt(inputDay) <32 ) {
			System.out.println("February can not have "+ inputDay +" days.");
		}
		
		else {
				System.out.println(outputStatement+" "+ monthName + " " + inputDay+ ", "+ inputYear  );
				
			}
	} 

}
