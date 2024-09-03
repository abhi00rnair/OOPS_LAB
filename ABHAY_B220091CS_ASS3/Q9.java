class Account{
    private String accno;
    protected double fieldbalance;

    Account(String accno,double fieldbalance){
        this.accno=accno;
        this.fieldbalance=fieldbalance;
    }
    
    public void deposit(double amount){
        this.fieldbalance=fieldbalance+amount;
    }
    public double  getbalance(){
        return fieldbalance;
    }
}

class savingsacc extends Account{
    protected double interest;

    savingsacc(String accno,double fieldbalance,double interest){
        super(accno, fieldbalance);
        this.interest=interest;
    }

    public void addinterest(){
        double rate=interest;
        double bal=fieldbalance;

        fieldbalance=bal+((rate*bal)/100);
    }
}

public class Q9{
    public static void main(String[] args) {
        savingsacc acc1= new savingsacc("123456", 1000.00, 5.0);
        System.out.println(acc1.getbalance());
    }
}