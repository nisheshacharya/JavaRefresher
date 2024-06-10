package recursions;

public class Fibonacci {
    static int fibonacci(int n){
        if(n == 2){
            return 1;
        }
        else if(n==1){
            return 0;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
