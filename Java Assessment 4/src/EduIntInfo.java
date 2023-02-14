class Educational extends Staff{
    String qualification;

    void getDetails(){
        System.out.print("Enter the Qualification: ");
        qualification = sc.nextLine();
    }
    void show(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
        System.out.println("The Qualification: " + qualification);
    }
}
class Teacher_1 extends Educational{
    String subject,publication;

    void getDetails(){
        System.out.print("Enter the Subject: ");
        subject = sc.nextLine();

        System.out.print("Enter the publication: ");
        publication = sc.nextLine();
    }
    void show(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
        System.out.println("The Qualification: " + qualification);

    }
}
class Officer_1 extends Educational{
    String grade;
    void getDetails(){
        System.out.print("Enter the Officer's Grade: ");
        grade = sc.nextLine();
    }
    void show(){
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Code: " + staffCode);
        System.out.println("The Officer's Grade: " + grade);
        System.out.println("The Qualification: " + qualification);

    }
}
public class EduIntInfo {
    public static void main(String[] args){
        Educational E = new Educational();
        E.getDetails();
        E.show();

        Teacher_1 T = new Teacher_1();
        T.getDetails();
        T.show();

        Officer_1 O = new Officer_1();
        O.getDetails();
        O.show();
    }
}