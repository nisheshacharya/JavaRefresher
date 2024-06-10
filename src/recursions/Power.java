package recursions;

public class Power {

    static double findPower(double n, double i){
        if(n==i){
            return 1;
        }
        else if (n % i == 0){
            return 1 + findPower(n/i , i);
        }
        else{
            return 0;
        }

    };
    public static void main(String[] args) {
        System.out.println(findPower(8,2));
    }
}
