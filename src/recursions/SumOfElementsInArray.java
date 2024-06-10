package recursions;

import java.util.Arrays;

public class SumOfElementsInArray {
    public static int sumOfArray(int[]array){
        int i = array.length -1;
        if(i== 0){
            return array[0];
        }else {

            return array[i] + sumOfArray(Arrays.copyOfRange(array, 0, i));
        }
    }
    public static void main(String[] args) {
        int [] intArray = {1,2,3,4,5};
        System.out.println(sumOfArray(intArray));

    }
}
