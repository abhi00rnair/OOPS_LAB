
import java.util.Random;

class Sensor{
    int sensorid;
    String sensortype;
    boolean isactive;

    Random rand=new Random();

    Sensor(String sensortype){
        this.sensortype=sensortype;
        this.isactive=true;
        this.sensorid=rand.nextInt(10000000);
    }
    
    void display(){
        System.out.println("sensorid :"+this.sensorid);
        System.out.println("sensortype :"+ this.sensortype);
        System.out.println("isactive"+" "+ this.isactive);
    }
}
public class Q5{
    public static void main(String[] args) {
        Sensor s1=new Sensor("temperture");
        Sensor s2=new Sensor("humidity");

        s1.display();
        s2.display();

    }
}