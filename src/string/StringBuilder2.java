package string;

public class StringBuilder2 {
    public static void main(String[] args) {
        String word1 = "Apple";
        String word2 = "Apple";

        System.out.println(checkEqual(word1, word2));
        System.out.println(reverseString(word1));

    }
    public  static boolean checkEqual (String word1,String word2){
        StringBuilder sb = new StringBuilder(word1);
        StringBuilder sb2 = new StringBuilder(word2);
        return (sb.toString().equals(sb2.toString())); // need to change to String

    }
    public static  String reverseString (String word){
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();

    }
}
