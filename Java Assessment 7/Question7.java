import java.io.*;
class AgeNotWithInRangeException extends Exception
{
    public String toString()
    {
        return("Age is not between 15 and 21. Please ReEnter the Age");
    }
}
class NameNotValidException extends Exception
{
    public String validname(){
        return("Name is not Valid. Please ReEnter the Name");
    }
}
class Student
{
    int roll,age;
    String name,course;

    Student(int r,String n,int a,String c)
    {
        roll=r;
        course=c;
        int l,temp=0;
        l=n.length();
        for(int i=0;i<l;i++)
        {
            char ch;
            ch=n.charAt(i);
            if(ch<'A' || ch>'Z' && ch<'a' || ch>'z') {
                temp=1;
            }
        }
        /*———-Checking Name——————–*/
        try
        {
            if(temp==1) {
                throw new NameNotValidException();
            }
            else{
                name=n;
            }
        }
        catch(NameNotValidException e2)
        {
            System.out.println(e2);
        }
        /*———-Checking Age——————–*/
        try
        {
            if(a>=15 && a<=21)
                age=a;
            else
                throw new AgeNotWithInRangeException();
        }
        catch(AgeNotWithInRangeException e1)
        {
            System.out.println(e1);
        }
    }
    void display()
    {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
class Question7
{
    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r,a;
        String n,c;

        System.out.println("Enter RollNo,Name,Age,Course");

        r=Integer.parseInt(br.readLine());
        n=br.readLine();
        a=Integer.parseInt(br.readLine());
        c=br.readLine();
        Student s=new Student(r,n,a,c);
        s.display();
    }
}