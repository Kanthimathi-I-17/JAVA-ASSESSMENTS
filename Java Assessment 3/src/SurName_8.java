import java.util.*;
public class SurName_8
{
    public static void main(String[] args)
    {
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name(Format: Firstname Surname): ");
        n=sc.nextLine();
        String [] t=n.split(" ");

        int l=t.length;
        System.out.print("Your Surname: " + t[l-1]);
    }
}