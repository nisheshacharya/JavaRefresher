package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareStrings {

    public static void main(String[] args) {
        String a = "Good ";
        String b = "morning!";
        char c = 'c';
        String str = "coconut";
        String[] fruits = new String[]{"Apple", "Cherry", "Banana"};

//        countChar(c, str);
//        countCharByEquals(c, str);
        String sortedArray = Arrays.toString(sortArray(fruits));
        System.out.println(sortedArray);
//        concatStrings(a, b);
    }


// Count characters
    public static int countChar (char c, String str){
       int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.toLowerCase().charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Count of "+ c + " in "+ str +" is "+ count);
        return count;
    }

    //Count characters using Equals

    public static int countCharByEquals (char c, String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if((str.toLowerCase().charAt(i)+ "").equals(c+"")) {
                count++;
            }
        }
        System.out.println("Count of "+ c + " in "+ str +" is "+ count);
        return count;
    }

    //Sort Strings in an array using compareTo
    public static String[] sortArray(String[] given) {
        int n = given.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (given[j].compareTo(given[j + 1]) > 0) {
                    String temp = given[j];
                    given[j] = given[j + 1];
                    given[j + 1] = temp;
                }
            }
        }
        return given;
    }

    //Concat String using .concat();
    public static void concatStrings(String a, String b){
        String output = a.concat(b);
        System.out.println(output);
    }


}
