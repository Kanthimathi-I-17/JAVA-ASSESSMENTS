//If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
// your program should be able to find that the sub array lies between the indexes 3 and 8.

import java.util.Arrays;

public class ArraySubArray_5 {
    public static void main(String[] args){
        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int i;
        System.out.print("The Array: ");
        for (i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int[] subArray = Arrays.copyOfRange(array,3,9);
        System.out.print("The Sub Array: ");
        for (i=0; i<subArray.length; i++){
            System.out.print(subArray[i]+" ");
        }
    }
}
