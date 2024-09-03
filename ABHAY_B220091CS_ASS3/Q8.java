class employee{
    String name;
    int age;
    String address;
    String phone;
    double salary;

    public employee(String name,int age,String address,String phone,double salary) {
        this.name=name;
        this.age=age;
        this.address=address;
        this.phone=phone;
        this.salary=salary;
    }
    void getdetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
        System.out.println(salary);
    }

    void updatedetails(String name,int age,String address,String phone,double salary){
        this.name=name;
        this.age=age;
        this.address=address;
        this.phone=phone;
        this.salary=salary;
    }

    double annulasalary(){
        return salary*12;
    }
}

class officer extends employee{
    String specialisation;
    officer(String name,int age,String address,String phone,double salary,String specialisation){
        super(name, age, address, phone, salary);
        this.specialisation=specialisation;
    }
    void getspecial(){
        System.out.println(specialisation);
    }
    void updatespecial(String special){
        this.specialisation=special;
    }
    void calculatesalary(){
        System.out.println(salary);
    }

}

class manager extends employee{
    String dept;

    manager(String name,int age,String address,String phone,double salary,String dept){
        super(name, age, address, phone, salary);
        this.dept=dept;
    }

    void getdept(){
        System.out.println(dept);
    }
    void updatedept(String deptt){
        dept=deptt;
    }
    void calculatesalaryy(){
        System.out.println(salary);
    }
}

public class Q8{
    public static void main(String[] args) {
        
    }
}