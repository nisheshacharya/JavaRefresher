package recursions;

public class ReverseString {
    public static String reverseString(String word){
        if(word.length()==0){
            return "";
        }
        return word.charAt(word.length()-1) + reverseString(word.substring(0, word.length()-1));
    }
    public static void main(String[] args) {
        String word = "abcdefg";
        System.out.println(reverseString(word));
    }
}
