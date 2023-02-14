package tybca;

import java.util.Scanner;

public class Marks {
    Scanner sc = new Scanner(System.in);
    public int mark1, mark2, mark3, mark4, mark5;
    public void getMarks(){
        System.out.print("Enter Mark for Subject 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Mark for Subject 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter Mark for Subject 3: ");
        mark3 = sc.nextInt();
        System.out.print("Enter Mark for Subject 4: ");
        mark4 = sc.nextInt();
        System.out.print("Enter Mark for Subject 5: ");
        mark5 = sc.nextInt();
    }
}
