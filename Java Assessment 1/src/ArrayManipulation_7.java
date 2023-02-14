//7. Write a java program to do the following in a given Array:
//        Test if the given element is contained in an array or not.
//        To find the index of an array
//        To remove the element in an array
//        To find the maximum and minimum value of an array.
//        To find duplicate values in an array.


//import java.util.*;

import java.util.*;

public class ArrayManipulation_7 {
    public static void main(String[] args){
        int numbers[] = {10, 10, 20, 20, 30, 30, 40, 50, 60, 70, 80, 90, 100};

        //To find duplicate values in an array.
        int i,j;
        System.out.print("Duplicate values in the array are : ");
        for (i = 0; i < numbers.length; i++){
            for (j = i+1; j < numbers.length; j++){
                if( numbers[i] == numbers[j])
                    System.out.println(numbers[j] + " ");
            }
        }

        //        To find the maximum and minimum value of an array.
        Integer[] num = {2,3,47,8,9};
        int max = Collections.max(Arrays.asList(num));
        int min = Collections.min(Arrays.asList(num));

        System.out.println("Maximum number of array is : " + max);
        System.out.println("Minimum number of array is : " + min);


        //        To remove the element in an array
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
        System.out.println("The actual array: " + al);
        al.remove(2);
        System.out.println("The array after element removed: " + al);
    }
}
