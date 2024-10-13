abstract class shipment{
    double weight;
    double distance;

    shipment(double weight,double distance){
        this.weight=weight;
        this.distance=distance;
    }

}
class Domesticshipment extends shipment{
    String transportmode;
    Domesticshipment(double weight,double distance,String mode){
        super(weight, distance);
        this.transportmode=mode;
    }
}
class intershipment extends shipment{
    double customduties;
    intershipment(double weight,double distance,double customduties){
        super(weight, distance);
        this.customduties=customduties;
    }
}

class expressshipment extends shipment{
    double expressfee;

    expressshipment(double weight,double distance, double expressfee){
        super(weight, distance);
        this.expressfee=expressfee;
    }
}

class shippingcalculator{
    double calculatecost(Domesticshipment d1){
        return d1.weight*1.5+d1.distance*0.5;
    }
    double calculatecost(intershipment i1){
        return i1.weight*2+i1.distance*0.8;
    }
    double calculatecost(expressshipment e1){
        return e1.weight*1.5+e1.distance*0.5;
    }
}
public class q2{
    public static void main(String[] args) {
        shippingcalculator s1=new shippingcalculator();
        Domesticshipment d1=new Domesticshipment(10.2,545,"water");
        double ret=s1.calculatecost(d1);
        System.out.println(ret);
    }
}