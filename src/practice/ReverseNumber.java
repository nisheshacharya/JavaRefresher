package practice;

public class ReverseNumber {
    public static int reverseNumber(int num, int reversedNum){
        if(num== 0){
            return reversedNum;
        }else {

            return reverseNumber(num / 10, reversedNum * 10 + num % 10);
        }
    }



    public static void main(String[] args) {
        System.out.println(reverseNumber(321, 0));
    }
}
