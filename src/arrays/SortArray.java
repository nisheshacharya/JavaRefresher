package arrays;

import java.util.Arrays;

public class SortArray {
    static void sortedArray(int[] intArray){
        int temp;

        for(int i = 0; i<intArray.length; i++ ){

            for (int j = 0; j<intArray.length-1; j++ ){
                if(intArray[i] < intArray[j]){
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
    static void removeDuplicate(int[]array){
        int index = 0;
        int[]unique = new int[array.length];
        if(array.length != 0) {
            unique[index++] = array[0];

            for (int i = 0; i < array.length; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j <index; j++) {
                    if (array[i] == unique[j]){
                        isDuplicate = true;
                        break;
                    }
                }
                if(!isDuplicate){
                    unique[index++] = array[i];
                }
            }
            int[]trimmedArray = Arrays.copyOf(unique, index);
            System.out.println(Arrays.toString(trimmedArray));
        }

    }
    public static void main(String[] args) {
        int[] sample = {6,6,5,5,7,8,4,9,3,0,5,4,2,10,1};
//        sortedArray(sample);
        removeDuplicate(sample);
    }
}
