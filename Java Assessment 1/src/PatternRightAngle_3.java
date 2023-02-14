import java.util.Scanner;

public class PatternRightAngle_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = sc.nextInt();
        int i,j;
        for(i = 1; i<=number; i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
