package pack2;

import pack1.Employee;

import java.util.Scanner;

public class Manager extends Employee {
    Scanner sc = new Scanner(System.in);
    public String departmentName,incentive;
    public void getDetails(){
        System.out.print("Enter the Department Name: ");
        departmentName = sc.next();
        System.out.print("Enter the Incentive: ");
        incentive = sc.next();
    }
}
