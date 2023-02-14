//2.  Write a Java program to find the number of days in a month.

import java.util.Scanner;

public class DaysInMonth_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a month in number: ");
        int month_in_no = sc.nextInt();

        if( month_in_no == 1 || month_in_no == 3 || month_in_no == 5 || month_in_no == 7 || month_in_no == 8 || month_in_no == 10 || month_in_no == 12 ){
            System.out.println("The number of days: 31" );
        }
        else if ( month_in_no == 4 || month_in_no == 6 || month_in_no == 9 || month_in_no == 11 ) {
            System.out.println("The number of days: 30" );
        }
        else {
            System.out.println("The number of days: 28 (or) 29" );
        }
    }
}
