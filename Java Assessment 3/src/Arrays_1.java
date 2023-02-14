//1. Write a java program to find the following Using Array:


import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args){
        int[] arr1 = {78, 218, 23, 63, 67, 90, 69, 21}; // array
        int i;
//        print the array 1
        System.out.print("The Array 1: ");
        for ( i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

//        To find the maximum value of an array
        int MimMax = arr1[0];
        for ( i = 0; i < arr1.length; i++){
            if ( MimMax < arr1[i]){
                MimMax = arr1[i];
            }
        }
        System.out.println("The maximum value of an array 1: " + MimMax);

//        To Find the minimum value of an Array.
        for ( i = 0; i < arr1.length; i++){
            if ( MimMax > arr1[i]){
                MimMax = arr1[i];
            }
        }
        System.out.println("The minimum value of an array 1: " + MimMax);

//       To Sort Two Arrays and Merged in the Sorted Order.

        int[] arr2 = {5,1,8,9,2};
        int[] arr3 = {7,3,6,0,4};
        int l=0,j=0,k=0;
        int arr2len = arr2.length;
        int arr3len = arr3.length;
        int[] mergeArr = new int [arr2len+arr3len];
//        the array 2
        System.out.print("The Array 2: ");
        for ( i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
//        the array 3
        System.out.print("The Array 3: ");
        for ( i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        while (l < arr2len){
            mergeArr[k] = arr2[l];
            l++;
            k++;
        }
        while (j < arr3len){
            mergeArr[k] = arr3[j];
            j++;
            k++;
        }
        Arrays.sort(mergeArr);

        System.out.print("Sorted Array for Arrays 2 & 3: ");
        for (i=0; i<arr2len+arr3len;i++){
            System.out.print(" " + mergeArr[i] );
        }
        System.out.println();

//        To find the Length of an Array.

        System.out.println("The length of the array 1: " + arr1.length);
        System.out.println("The length of the array 2: " + arr2.length);
        System.out.println("The length of the array 3: " + arr3.length);

//        To Find the Reverse of an Array.
        System.out.print("The Reverse of an Array 1: ");
        for (i=(arr1.length)-1; i>=0; --i){
            System.out.print(arr1[i] + " ");
        }
    }
}