
interface PoweredDevice {
    void powerOn();
    void powerOff();
}

interface NetworkEnabled {
    void connectToNetwork(String networkName);
    void disconnectFromNetwork();
}

class SmartPhone implements PoweredDevice, NetworkEnabled {
    String model;
    boolean isPoweredOn;
    String connectedNetwork;

    public SmartPhone(String model) {
        this.model = model;
        this.isPoweredOn = false; 
        this.connectedNetwork = null; 
    }

    @Override
    public void powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true;
            System.out.println(model + "powered on");
        } else {
            System.out.println(model + "alredy on");
        }
    }
    @Override
    public void powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false;
            System.out.println(model + "powered off");
        } else {
            System.out.println(model + "alread off.");
        }
    }

    @Override
    public void connectToNetwork(String networkName) {
        if (isPoweredOn) {
            if (connectedNetwork == null) {
                connectedNetwork = networkName;
                System.out.println(model + " connected to network: " + networkName);
            } else {
                System.out.println(model + " is already connected to: " + connectedNetwork);
            }
        } else {
            System.out.println("Cannot connect to network. " + model + " is powered off.");
        }
    }


    @Override
    public void disconnectFromNetwork() {
        if (isPoweredOn && connectedNetwork != null) {
            System.out.println(model + " disconnected from network: " + connectedNetwork);
            connectedNetwork = null;
        } else if (!isPoweredOn) {
            System.out.println("Cannot disconnect. " + model + " is powered off.");
        } else {
            System.out.println(model + " is not connected to any network.");
        }
    }

   
    @Override
    public String toString() {
        return "SmartPhone Model: " + model + 
               "\nPower Status: " + (isPoweredOn ? "On" : "Off") +
               "\nConnected Network: " + (connectedNetwork != null ? connectedNetwork : "None");
    }
}

public class q1 {
    public static void main(String[] args) {
        SmartPhone phone1=new SmartPhone("S21 fe ");
        phone1.powerOn();
        phone1.connectToNetwork("bsnl");
        phone1.connectToNetwork("bsnl");
        phone1.disconnectFromNetwork();
        phone1.powerOff();
        String temp=phone1.toString();
        System.out.println(temp);
    }
}
