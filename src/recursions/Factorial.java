package recursions;

public class Factorial {
    static int factorialOf(int n){
        if (n == 1){
            return 1;
        }
        return n* factorialOf(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialOf(4));
    }
}
