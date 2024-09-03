
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class account{
    private static int acccounter=1000;
    int accno;
    String name;
    double balance;
    public account(String name, double initial) {
        this.accno = ++acccounter;
        this.name = name;
        this.balance =initial;
    }

    public int getAccountNumber() {
        return accno;
    }

    public String getAccountHolderName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double depositamount){
        if(depositamount>0){
            balance+=depositamount;
        }else{
            System.out.println("enter a valid amount");
        }
    }

    public void withdraw(double amountwithdraw){
        if(amountwithdraw>0 && amountwithdraw<=balance){
            balance-=amountwithdraw;
        }else{
            System.out.println("enter a valid one");
        }
    }
}

public class Q7{
    private Map<Integer, account> accounts=new HashMap<>();
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Q7 bankingsystem=new Q7();
        bankingsystem.run();
    }
    public void run(){
        System.out.println("banking system menu");
        System.out.println("choose an option");
        System.out.println("option 1:create a new account");
        System.out.println("option 2: deposit mone");
        System.out.println("optiion 3: withdraw money");
        System.out.println("option 4: check balace");
        System.out.println("option 5: exit");
        Scanner my=new Scanner(System.in);
while(true){
        int temp=my.nextInt();
        switch(temp){
            case 1:
                createaccount();
                break;
            case 2:
                depositmoney();
                break;      
            case 3:
               withdrawmoney();
                break;  
            case 4:
                checkbalance();
                break;
            case 5:
                exit();
                return;
            default:
                System.out.println("invalid entry");      

        }
}

    }
    public  void createaccount(){
        System.out.println("enter your name");
        String name=scan.nextLine();
        System.out.println("enter intial depoit");
        int initial=scan.nextInt();
        account person1=new account(name,initial);
        accounts.put(person1.getAccountNumber(), person1);
        System.out.println("account creatd succesfully");
        System.out.println("Account number is "+ person1.accno);
        System.out.println("account hlder"+ person1.name);
        System.out.println("balance :"+ person1.balance);
        
    }

       private void depositmoney() {
        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();
        scan.nextLine(); // Consume newline

        account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double depositAmount = scan.nextDouble();
            scan.nextLine(); // Consume newline

            account.deposit(depositAmount);
            System.out.println("Updated account details:");
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Hoder: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("ccount not found.");
        }
    }

    private void withdrawmoney() {
        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();
        scan.nextLine(); 

        account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scan.nextDouble();
            scan.nextLine();

            account.withdraw(withdrawalAmount);
            System.out.println("Updated acount details:");
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private void checkbalance() {
        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();
        scan.nextLine();

        account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account Nmber: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("ccount not found.");
        }
    }

    public void exit(){
        System.out.println("exiting the banking system.goodbye!");
    }
        

    }

