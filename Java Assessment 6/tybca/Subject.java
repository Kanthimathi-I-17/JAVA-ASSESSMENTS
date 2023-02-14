package tybca;

import java.util.Scanner;

public class Subject {
    Scanner sc = new Scanner(System.in);
    String sub1, sub2, sub3, sub4, sub5;
    public void getSubjects(){
        System.out.print("Enter Subject 1: ");
        sub1 = sc.next();
        System.out.print("Enter Subject 2: ");
        sub2 = sc.next();
        System.out.print("Enter Subject 3: ");
        sub3 = sc.next();
        System.out.print("Enter Subject 4: ");
        sub4 = sc.next();
        System.out.print("Enter Subject 5: ");
        sub5 = sc.next();
    }
}
