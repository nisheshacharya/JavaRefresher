package loops;

public class PrintPyramid {

    public static void main(String[] args) {
        pyramid();

    }

    static void pyramid() {
        int i ;

        for (i = 0; i < 5; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
