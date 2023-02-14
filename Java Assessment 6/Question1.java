import tybca.*;
public class Question1 {
    public static void main(String[] args){
        Subject s = new Subject();
        Marks m = new Marks();

        s.getSubjects();
        m.getMarks();

        int total = m.mark1 + m.mark2 + m.mark3 + m.mark4 + m.mark5;
        double percentage = (total/500.0)*100;

        System.out.println("Total: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");

    }
}
