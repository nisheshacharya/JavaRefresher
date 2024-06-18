package continue_break;

public class Break_Continue {

    static void printEven(int n){
        int i = 0;
        while(i<=n){
            if(i %2!= 0){
                i++;
                continue;
            };
            System.out.println(i);
            i++;
        }
    }
    static void printNumbersThatSumUpTo(int n){
        int  j = 0;
        int k = n;

        while(j <=n){
            while (k>= 0) {
                if (k + j != n) {
                    k--;
                    continue;
                }
                System.out.println(j + " ," + k);
                k--;
                if(j> n/2){
                    break;
                }
                j++;
            }
        }
        ;

    }
    public static void main(String[] args) {
        printEven(10);
        System.out.println("---------------");
        printNumbersThatSumUpTo(10);
        System.out.println("---------------");

    }
}
