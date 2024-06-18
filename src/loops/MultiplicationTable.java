package loops;

public class MultiplicationTable {

    static void multiTable(int n){
        int i = 1;
        while( i <= 10)
        {
            System.out.println( i +"* "+n + "=" + i*n);
            i++;
        };
    }
    public static void main(String[] args) {
        multiTable((2));

    }
}
