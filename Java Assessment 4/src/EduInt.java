import java.util.Scanner;

class Staff{
    Scanner sc = new Scanner(System.in);
    int staffCode;
    String staffName;
    void method1(){
        System.out.print("Enter the Staff code: ");
        staffCode = sc.nextInt();

        System.out.print("Enter the Staff Name: ");
        staffName = sc.next();
        System.out.println();
    }
    void method2(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
    }

}

class Teacher extends Staff{
    String subject,publication;

    void method3(){
        System.out.print("Enter the Subject: ");
        subject = sc.next();

        System.out.print("Enter the publication: ");
        publication = sc.next();
    }
    void method4(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class Typist extends Staff{
    float speed;

    void method5(){
        System.out.print("Enter the Typist's speed: ");
        speed = sc.nextFloat();
    }
    void method6(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
        System.out.println("The Typist's Speed: " + speed);
    }
}

class Officer extends Staff{
    String grade;
    void method7(){
        System.out.print("Enter the Officer's Grade: ");
        grade = sc.next();
    }
    void method8(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
        System.out.println("The Officer's Grade: " + grade);
    }
}

class Regular extends Typist{
    float wage;
    void method9(){
        System.out.print("Enter the wage for Regular Typist: ");
        wage = sc.nextFloat();
    }
    void method10(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
        System.out.println("The wage for Regular Typist: " + wage);
    }
}

class Casual extends Typist{
    float wage;
    void method11(){
        System.out.print("Enter the wage for Regular Typist: ");
        wage = sc.nextFloat();
    }
    void method12(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
        System.out.println("The wage for Regular Typist: " + wage);
    }
}

public class EduInt {
    public static void main(String[] args){

    }
}
