//10. Develop a program to create a class called Box and calculate its volume by calling its method.


import java.util.Scanner;

public class BoxVolume_10 {
    public static double volume(double a, double b, double c){
        double vol = a*b*c;
        return vol;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the box: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the box: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter the height of the box: ");
        double height = sc.nextDouble();

        System.out.print("The volume of the box is: " + volume(length,breadth,height));
    }
}