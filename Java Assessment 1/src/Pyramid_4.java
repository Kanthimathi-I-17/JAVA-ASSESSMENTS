import java.util.Scanner;

public class Pyramid_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the pyramid: ");
        int number = sc.nextInt();

        int i,s,x,j;
        s = number+3;
        for(i = 1; i<=number; i++){
            for (x=s;x!=0;x--){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
            s--;
        }
    }
}
