abstract class bank{
    String accno;
    double balance;

    bank(String accno,double balance){
        this.accno=accno;
        this.balance=balance;
    }
    abstract double calculatinterest();
    void withdraw(double amount){
        if(balance<amount){
            System.out.println("insufficient");
        }else{
            balance-=amount;
            System.out.println("amount withdrawn");
        }
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println("deposited");
    }
    void getmonthlysatement(){
        System.out.println(accno);
        System.out.println(balance);
    }
}
abstract class account extends bank{
    account(String accno, double balance){
        super(accno, balance);
    }

}
 class savings extends account{
    double interest=5.0;
    double minbalance=500;
    double penality=100;
    savings(String accno, double balance){
        super(accno, balance);
    }
    @Override
    double calculatinterest(){
        if(balance>=minbalance){
            return balance*(interest/100);
        }else{
            balance-=penality;
            return 0;
        }
    }
    @Override
    void getmonthlysatement(){
        super.getmonthlysatement();
        System.out.println(calculatinterest());
    }
}
abstract class checking extends account{
    double overdraftlimit=100;
    double fees=2;
    double overdraftrate=5;
    checking(String accno, double balance){
        super(accno, balance);
    }
    @Override
    void withdraw(double amount){
        if(balance+overdraftlimit<amount){
            System.out.println("denied");
        }else{
            balance-=(amount+fees);
        }
    }
}
abstract class interaccount extends account{
    double conversionrate=100;
    interaccount(String accno, double balance,double rate){
        super(accno, balance);
        this.conversionrate=rate;
    }
    @Override
    void deposit(double amount){
        double invest=amount*conversionrate;
        super.deposit(invest);
    }
}

public class q4 {
    public static void main(String[] args) {
        savings s1=new savings("10001", 5246);
        s1.deposit(4522);
        s1.withdraw(568);
        s1.getmonthlysatement();
    }
    
}
