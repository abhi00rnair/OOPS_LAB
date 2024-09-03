class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    void sound(){
        System.out.println(this.getClass().getSimpleName()+ "sound");
        System.out.println(name);
    }
}
class Mammal extends Animal {
    int age;
    Mammal(String name, int age){
        super(name);
        this.age=age;
    }
    @Override
    void sound(){
        super.sound();
        System.out.println(age);
    }
}
class Dog extends Mammal{
    String breed;
    Dog(String name, String breed, int age){
        super(name, age);
        this.breed=breed;
    }
    @Override
    void sound(){
        super.sound();
        System.out.println(breed);
    }
}
class Puppy extends Dog{
    String nick;
    Puppy(String name, String breed, int age,String nick){
        super(name, breed, age);
        this.nick=nick;
    }
    @Override
    void sound(){
        super.sound();
        System.out.println(nick);
    }
}
public class Q5{
    public static void main(String[] args) {
        Puppy p1=new Puppy("buddy","golden retriever",14,"nickk");
        p1.sound();
    }
}    

