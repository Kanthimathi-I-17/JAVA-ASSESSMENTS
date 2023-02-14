import java.util.Scanner;

public class FloydsTriangle_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int number = sc.nextInt();
        int i,j,f=1;
        for (i=1;i<=number;i++){
            for(j=1;j<=i;j++){
                System.out.print(f+" ");
                f++;
            }
            System.out.println();
        }
    }
}
