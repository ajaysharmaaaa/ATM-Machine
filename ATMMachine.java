import java.util.Scanner;

class ATM{
    double balance=999199.15;
    int pin = 1919;

    public void checkpin(){
        System.out.print("Enter your 4 Digit PIN Number : ");
        Scanner s = new Scanner(System.in);
        int enteredpin=s.nextInt();
        if(enteredpin==pin){
              menu();
        }
        else{
            System.out.println("Enter a Valid PIN ");
        }
        

    }

    public void menu(){
      
        System.out.println("Enter your Choice : ");
             System.out.println("1. Check A/C Balance");
             System.out.println("2. Withdraw Money");
             System.out.println("3. Deposit Money");
             System.out.println("4. Exit");

             Scanner s = new Scanner(System.in);
             int opt=s.nextInt();
             if(opt==1){
                checkBalance();
             }
                else if(opt==2){
                    withdrawMoney();
                }
                else if(opt==3){
                    depositMoney();

                }
                else if(opt==4){
                    return;
                
             }
             else{
                System.out.println("Enter a valid choice");
             }
            }
            public void checkBalance(){
                System.out.println("Balance : "+balance);
                menu();
            }
            public void withdrawMoney(){
                System.out.println("Enter Amount to Withdraw : ");
                Scanner s = new Scanner(System.in);
                float amount = s.nextFloat();
                if(amount>balance){
                    System.out.println("Insufficient Balance");
                }
                else{
                  balance=balance-amount;
                  System.out.println("Money Withdraw Successful");

                }
                menu();
            }

            public void depositMoney(){
                System.out.println("Enter the Amount");
                Scanner s = new Scanner(System.in);
                float amount=s.nextInt();
                balance= balance+amount;
                System.out.println("Money Deposit Successfully");
                menu();
            }
            
    }
    

public class ATMMachine {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.checkpin();
    }
}
