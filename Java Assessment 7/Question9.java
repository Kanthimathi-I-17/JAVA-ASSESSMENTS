import java.io.*;
class MarksOutOfBoundException extends Exception
{
    public String toString()
    {
        return "Enter marks in between 1 & 100";
    }
}
class Student1
{
    int rno;
    float marks[];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Student1()
    {
        rno=0;
        marks=new float[4];
        for(int i=0;i<4;i++)
            marks[i]=0;
    }
    public void accept()
    {
        System.out.println("Enter roll no & marks of 4 subjects ");
        try
        {
            rno=Integer.parseInt(br.readLine());
            for(int i=0;i<4;i++)
            {
                marks[i]=Float.parseFloat(br.readLine());
                if(marks[i]<0 || marks[i]>100)
                    throw new MarksOutOfBoundException();
            }
        }
        catch(MarksOutOfBoundException me)
        {
            System.out.println(me);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds");
        }
        catch(IOException ie)
        {
            System.out.println("Io Exception");
        }
    }

    public void display()
    {
        System.out.println("Roll no\tMarks1\tMarks2\tMarks3\tMarks4");
        System.out.print(rno+"\t");
        for(int i=0;i<4;i++)
            System.out.print(marks[i]+"\t");
    }

    public static void main(String[] args)
    {
        Student1 s1=new Student1();
        s1.accept();
        s1.display();
    }
}
