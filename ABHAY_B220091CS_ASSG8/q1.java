import java.util.*;
interface Person{
    String getname();
    String getid();

}
interface MealPlan{
    String mealplanname();
    List<menuitem> listofmenuitems();
    double totalprice();
}
interface Student extends Person{
    List<MealPlan> getsubscribedmealplan();
    void subscribemeal(MealPlan m1);
    void unsubscribemeal(MealPlan m1);
}
class meal implements MealPlan{
    String nameofmealplan;
    List<menuitem>m1;
    double totalprice;

    meal(String mplan,double price){
        this.nameofmealplan=mplan;
        this.m1=new ArrayList<>();
        this.totalprice=price;
    }
    public void addMenuItem(menuitem item) {
        m1.add(item);
        totalprice += item.getprice();
    }

    @Override
    public String mealplanname() {
        return this.nameofmealplan;
    }

    @Override
    public List<menuitem> listofmenuitems() {
        return this.m1;
    }

    @Override
    public double totalprice() {
        return this.totalprice;
    }

}
class menuitem{
    String itemname;
    double price;
    menuitem(String name, double price){
        this.itemname=name;
        this.price=price;
    }

    String getitemname(){
        return itemname;
    }
    double getprice(){
        return price;
    }
}

class StudentImpl implements Student {
     String name;
    String id;
    private List<MealPlan> subscribedMealPlans;
    public StudentImpl(String name, String id) {
        this.name = name;
        this.id = id;
        this.subscribedMealPlans = new ArrayList<>();
    }

    @Override
    public String getname() {
        return this.name;
    }

    @Override
    public String getid() {
        return this.id;
    }

    @Override
    public List<MealPlan> getsubscribedmealplan() {
        return this.subscribedMealPlans;
    }

    @Override
    public void subscribemeal(MealPlan mealPlan) {
        subscribedMealPlans.add(mealPlan);
    }

    @Override
    public void unsubscribemeal(MealPlan mealPlan) {
        subscribedMealPlans.remove(mealPlan);
    }
}

class MessController {
    private List<MealPlan> mealPlans;

    public MessController() {
        mealPlans = new ArrayList<>();
    }
    public void addMealPlan(MealPlan mealPlan) {
        mealPlans.add(mealPlan);
    }
    public void printSubscriptionStatus(StudentImpl student) {
        List<MealPlan> plans = student.getsubscribedmealplan();
        System.out.println(student.getname() + " "+ student.getid() );
        if (plans.isEmpty()) {
        } else {
            for (MealPlan plan : plans) {
                System.out.println( plan.mealplanname() + " " + plan.totalprice());
            }
        }
    }
    public void subscribemeal(StudentImpl student, MealPlan mealPlan) {
        student.subscribemeal(mealPlan);
    }
}


public class q1 {
    public static void main(String[] args) {
        MessController controller = new MessController();
meal vegetarianPlan = new meal("Vegetarian Plan", 10.0);
vegetarianPlan.addMenuItem(new menuitem("Salad", 5.0));
vegetarianPlan.addMenuItem(new menuitem("Fruit", 3.0));
controller.addMealPlan(vegetarianPlan);
StudentImpl student1 = new StudentImpl("Alice", "S001");
controller.subscribemeal(student1, vegetarianPlan);
controller.printSubscriptionStatus(student1);

    }
    
}