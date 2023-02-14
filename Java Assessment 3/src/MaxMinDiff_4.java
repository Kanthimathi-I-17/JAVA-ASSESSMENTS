//Consider an integer array, the number of elements in which is determined by the user.
// The elements are also taken as input from the user.
// Write a program to find those pair of elements that has the maximum and minimum difference
// among all element pairs.
//        (maximum difference = highest-lowest
//        Minimum difference = second lowest – lowest )


import java.util.Arrays;
import java.util.Scanner;

public class MaxMinDiff_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,number;
        System.out.print("Give a number: ");
        number = sc.nextInt();
        int[] arr = new int[number];
//the array input
        System.out.print("Give the array elements: ");
        for (i=0; i<number; i++){
            arr[i] = sc.nextInt();
        }
// the array
        System.out.print("The array: ");
        for (i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("The sorted array: "+Arrays.toString(arr));
        System.out.println("The highest: " + arr[number-1] + "; The lowest: " + arr[0] + "; the second lowest: " + arr[1]);
        System.out.println("Maximum difference (highest-lowest): " + (arr[number-1] - arr[0]) );
        System.out.print("Minimum difference (second lowest-lowest ): " + (arr[1]-arr[0]) );
    }
}
