import java.util.Scanner;

interface HDFC {
    void hdfcTransaction(double customerBalance, double productPrice);
}

interface ICICI {
    void iciciTransaction(double customerBalance, double productPrice);
}

class Flipkart implements HDFC, ICICI {
    private double flipkartBalance = 0; 

    @Override
    public void hdfcTransaction(double customerBalance, double productPrice) {
        if (customerBalance >= productPrice) {
            flipkartBalance += productPrice;
            customerBalance -= productPrice;
            System.out.println("Flipkart Account Balance: " + flipkartBalance);
            System.out.println("Remaining Customer Balance (HDFC): " + customerBalance);
        } else {
            System.out.println("Insufficient balance in HDFC account.");
        }
    }
    @Override
    public void iciciTransaction(double customerBalance, double productPrice) {
        if (customerBalance >= productPrice) {
            flipkartBalance += productPrice;
            customerBalance -= productPrice;
            System.out.println("Flipkart Account Balance: " + flipkartBalance);
            System.out.println("Remaining Customer Balance (ICICI): " + customerBalance);
        } else {
            System.out.println("Insufficient balance in ICICI account.");
        }
    }

    public double getFlipkartBalance() {
        return flipkartBalance;
    }
}

public class Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of transactions: ");
        int n = scanner.nextInt();

        Flipkart flipkart = new Flipkart();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction details (BankName CustomerBalance ProductPrice): ");
            String bankName = scanner.next();
            double customerBalance = scanner.nextDouble();
            double productPrice = scanner.nextDouble();
            
            if (bankName.equalsIgnoreCase("HDFC")) {
             
                flipkart.hdfcTransaction(customerBalance, productPrice);
            } else if (bankName.equalsIgnoreCase("ICICI")) {
              
                flipkart.iciciTransaction(customerBalance, productPrice);
            } else {
                System.out.println("Invalid bank name.");
            }
        }

        System.out.println("Total Flipkart Account Balance: " + flipkart.getFlipkartBalance());
        
        scanner.close();
    }
}
