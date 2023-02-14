import java.util.Scanner;
class Account{
    Scanner sc = new Scanner(System.in);
    String customerName;
    int accountNumber;
    float amount, deposit, interest, withdrawal;

    public void getInfo(){
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextFloat();

        if (amount < 500){
            System.out.println("The minimum amount should be above 500");
        }
    }
    public void show(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: " + amount);
    }
}

class Saving extends Account{
    public void deposit(){
        System.out.print("Enter Deposit Amount for saving account: ");
        deposit = sc.nextFloat();
        //show();
        amount = amount + deposit;
        System.out.println("After deposit the Total Amount in saving account: " + amount);
    }

    public void interest(){
        interest = (amount * 2) / 100;
        amount = amount + interest;
        System.out.println("The total amount with Interest in saving account: " + amount);
    }

    public void withdrawal(){
        System.out.print("Enter withdrawal amount for saving account: ");
        withdrawal = sc.nextFloat();
        if (withdrawal < amount){
            amount = amount - withdrawal;
            System.out.println("Balance after withdrawal in saving account: " + amount );
        }
        else {
            System.out.println("Insufficient Amount in saving account! ");
        }
    }
}
class Current extends Account{
    public void deposit(){
        System.out.print("Enter Deposit Total Amount for current account: ");
        deposit = sc.nextFloat();
        //show();
        amount = amount + deposit;
        System.out.println("After deposit the Total Amount in current account: " + amount);
    }

    void balance(){
        if (amount < 500){
            System.out.println("Minimum amount should be more than 500 and so 10/- is debited from your current account");
            amount = amount - 10;
            System.out.println("Balance After debited penalty amount 10/-  in current account: " + amount);
        }
        else {
            System.out.println("The balance amount in current account: " + amount);
        }
    }

    public void withdrawal(){
        System.out.println("Enter withdrawal amount for current account: ");
        withdrawal = sc.nextFloat();
        if (withdrawal < amount){
            amount = amount - withdrawal;
            System.out.println("Balance after withdrawal  in current account: " + amount );
        }
        else {
            System.out.println("Insufficient Amount in current account");
        }
    }
}

public class Bank_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Current C = new Current();
        Saving S = new Saving();
        int count = 0;

        System.out.println("************** Enter the Basic Details **************");

        System.out.print("Enter the account type:- Press C(Current) / S(Saving) : ");
        String accountType = sc.nextLine();

        if( accountType.equalsIgnoreCase("c") ){
            System.out.println("You have chosen current account");
            C.getInfo();
            while (count!=5){

                System.out.println("1.Display 2.Deposit 3.Withdrawal 4.Balance 5.Exit");
                System.out.println("Enter your choice for current account");
                int choose = sc.nextInt();
                    switch (choose) {
                        case 1 -> C.show();
                        case 2 -> C.deposit();
                        case 3 -> C.withdrawal();
                        case 4 -> C.balance();
                        case 5 -> System.exit(0);
                        default -> System.out.println("Out of choose! ");
                    }
            }

        }
        else if ( accountType.equalsIgnoreCase("s") ) {
            System.out.println("You have chosen Saving account");
            S.getInfo();
            while (count!=5){

                System.out.println("1.Display 2.Deposit 3.Withdrawal 4.Interest 5.Exit");
                System.out.println("Enter your choice for Saving account");

                int choose = sc.nextInt();
                    switch (choose) {
                        case 1 -> S.show();
                        case 2 -> S.deposit();
                        case 3 -> S.withdrawal();
                        case 4 -> S.interest();
                        case 5 -> System.exit(0);
                        default -> System.out.println("Out of choose! ");
                    }
            }
        }
        else {
            System.out.print("Choose the correct option!!");
        }
    }
}
