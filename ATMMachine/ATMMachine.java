package ATMMachine;


import java.util.*;

class ATM{

    float Balance;
    int PIN = 8764;

    public void CheckPin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int EnteredPin =  sc.nextInt();

        if(EnteredPin == PIN){
            menu();
        }
        else{
            System.out.println("You Entered an invalid Pin");
            CheckPin();
        }
    }

    public void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1){
            CheckBalance();
        }
        else if (option == 2){
            WithdrawMoney();
        }
        else if(option == 3){
            DepositMoney();
        }
        else if(option == 4){
            return;
        }
        else{
            System.out.println("Enter a Valid Option");
        }
    }
    public void CheckBalance(){
        System.out.println("Balance :" + Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter Amount to Withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money withdrawn successful");
        }
        menu();
    }
    public void DepositMoney(){
        System.out.println("Enter your Amount");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        Balance = Balance + Amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj =  new ATM();
        obj.CheckPin();
    }
}
