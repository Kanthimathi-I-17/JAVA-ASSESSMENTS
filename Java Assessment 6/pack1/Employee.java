package pack1;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    public String empName;
    public int empNo;
    public double empSalary;
    public void getInfo(){
        System.out.print("Enter Employee Name: ");
        empName = sc.next();
        System.out.print("Enter Employee Number: ");
        empNo = sc.nextInt();
        System.out.print("Enter Employee Salary: ");
        empSalary = sc.nextDouble();
    }
}
