import java.util.Scanner;

class Person{
    Scanner sc = new Scanner(System.in);
    int code;
    String name, gender, address;

    void getPersonInfo(){
        System.out.print("Enter the Person Code: ");
        code = sc.nextInt();

        System.out.print("Enter Person's Name: ");
        name = sc.next();

        System.out.print("Enter Person's Gender: ");
        gender = sc.next();

        System.out.print("Enter Person's Address: ");
        address = sc.next();
    }
    void displayPersonInfo(){
        System.out.println("The Person Code: " + code);
        System.out.println("The Person's Name: " + name);
        System.out.println("The Person's Gender: " + gender);
        System.out.println("The Person's Address: " + address);
    }
}
class PersonAccount extends Person{
    int accNo;
    String branchDetails;
    double pay;

    void getPersonAccountInfo(){
        System.out.print("Enter the Account Number: ");
        accNo = sc.nextInt();

        System.out.print("Enter the Branch Details: ");
        branchDetails = sc.next();

        System.out.print("Enter the Pay: ");
        pay = sc.nextDouble();
    }
    void displayPersonAccountInfo(){
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Branch Details: " + branchDetails);
        System.out.println("Account Pay: " + pay);
    }
}
class PersonAdmin extends Person{
    String designation;
    int experience;

    void getPersonAdminInfo(){
        System.out.print("Enter Admin Designation: ");
        designation = sc.next();

        System.out.print("Enter Admin Experience: ");
        experience = sc.nextInt();
    }
    void displayPersonAdminInfo(){
        System.out.println("Admin Designation: " + designation);
        System.out.println("Admin Experience: " + experience);
    }
}
public class PersonNetwork {
    public static void main(String[] args){
        PersonAccount PA = new PersonAccount();
        PersonAdmin A = new PersonAdmin();
        PA.getPersonInfo();
        PA.getPersonAccountInfo();
        A.getPersonAdminInfo();
        System.out.println();
        PA.displayPersonInfo();
        PA.displayPersonAccountInfo();
        A.displayPersonAdminInfo();
    }
}