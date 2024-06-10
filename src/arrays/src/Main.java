public class Main {
    public static  double getAverage(double[]numbers){
        double total = 0;
        for (int i = 0; i<numbers.length ; i++){
            total = total + numbers[i];
        }
        return total/numbers.length;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}