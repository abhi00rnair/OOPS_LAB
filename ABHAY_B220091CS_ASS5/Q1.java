import java.util.Scanner;

interface CurrencyConverter {
    double convertRupees(double amount);
    double convertDollars(double amount);
    double convertPounds(double amount);
}


class Bank implements CurrencyConverter {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    @Override
    public double convertRupees(double amount) {
        return amount;
    }

   
    @Override
    public double convertDollars(double amount) {
        return amount * 70;
    }

   
    @Override
    public double convertPounds(double amount) {
        return amount * 100;
    }

   
    public void deductBalance(double totalPurchase) {
        if (totalPurchase > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= totalPurchase;
            System.out.println("Remaining Balance: " + balance + " Rupees");
        }
    }
}

public class Q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total balance on the credit card (in Rupees): ");
        double balance = scan.nextDouble();

      
        System.out.print("Enter the prices of products from Shop A (in Rupees), Shop B (in Dollars), and Shop C (in Pounds) separated by spaces: ");
        double priceA = scan.nextDouble();  
        double priceB = scan.nextDouble();  
        double priceC = scan.nextDouble();  
        Bank bank = new Bank(balance);

        double totalPurchase = bank.convertRupees(priceA) + bank.convertDollars(priceB) + bank.convertPounds(priceC);

        bank.deductBalance(totalPurchase);

        scan.close();
    }
}
