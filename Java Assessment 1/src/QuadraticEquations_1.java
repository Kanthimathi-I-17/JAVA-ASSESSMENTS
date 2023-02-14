//1. Write a Java program to solve quadratic equations (use if, else if, and else).

import java.util.Scanner;

public class QuadraticEquations_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Give Number A: ");
        double A = sc.nextDouble();

        System.out.print("Give Number B: ");
        double B = sc.nextDouble();

        System.out.print("Give Number C: ");
        double C = sc.nextDouble();

//        if(A>0){
            double D = (B * B )- (4.0 * A * C);
            System.out.print(Math.abs(D));
            if(D == 0.0){
                double root1 = -B / (2.0 * A);
                System.out.println("Root is: " + root1);
            }
            else{
                double root1 = ( - B + Math.sqrt( Math.abs(D)) ) / (2.0 * A);
                double root2 = ( - B - Math.sqrt( Math.abs(D)) ) / (2.0 * A);

                System.out.println("Roots are: " + root1 + " , " + root2);
            }
//        }
//        else {
//            System.out.println("Enter a valid number");
//        }
    }
}
