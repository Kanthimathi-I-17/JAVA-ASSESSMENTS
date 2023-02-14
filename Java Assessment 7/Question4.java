import java.util.Scanner;
class InvalidNameException extends Exception{

}
public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the User Name: ");
        String userName = sc.next();
        try {
            for (int i=0; i<userName.length(); i++)
            {
                int ch = (int)userName.charAt(i);
                if ( (ch>=65&&ch<=90) || (ch>=97&&ch<=122) ){
//                    System.out.println("The entered name is in correct format");
                } else {
                    throw new  InvalidNameException();
                }
            }
            System.out.println("The given name is valid & User Name: " + userName);
        }
        catch (InvalidNameException e){
            System.out.println("Invalid User Name. ");
        }
    }
}
