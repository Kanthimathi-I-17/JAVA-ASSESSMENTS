//Take 20 integer inputs from user and print the following:
//
//        (i)number of positive numbers
//        (ii)number of negative numbers
//        (iii)number of odd numbers
//        (iv)number of even numbers
//        (v)number of 0s.
import java.util.Scanner;

public class intgerCount_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,positive=0, negative=0, odd=0, even=0, zero=0;
        System.out.print("Give 20 numbers: ");
        for (i=1; i<=20; i++){
            int number = sc.nextInt();

            if(number > 0){
                positive ++;
            }

            if (number < 0){
                negative ++;
            }

            if (number % 2 == 0){
                even ++;
            }

            if (number % 2 != 0){
                odd ++;
            }

            if (number==0){
                zero ++;
            }
        }
        System.out.println("No. of positive numbers:" + positive);
        System.out.println("No. of negative numbers:" + negative);
        System.out.println("No. of even numbers:" + even);
        System.out.println("No. of odd numbers:" + odd);
        System.out.println("No. of zero(s):" + zero);
    }
}
