package recursions;

public class Palindrome {

    static boolean checkpalindrome(String word){

        int l = word.length()-1;
        if(word.length()==1 || word.length() == 0){
            return true;
        }
        else if(word.charAt(0) == word.charAt(l)){
            return checkpalindrome(word.substring(1,l));
        } else{
            return false;
        }
    };
    public static void main(String[] args) {
        String word = "abccba";
        System.out.println(checkpalindrome(word));
    }
}
