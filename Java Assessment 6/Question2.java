//import pack1.*;
import pack2.*;

public class Question2 {
    public static void main(String[] args){
//        Employee e = new Employee();
        Manager m = new Manager();

        m.getInfo();
        m.getDetails();

        System.out.print("The Gross Salary: " + m.empSalary);
    }
}
