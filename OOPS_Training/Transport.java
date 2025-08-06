class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class TwoWheeler extends Vehicle {
    @Override
    void start() {
        System.out.println("Two-wheeler is starting...");
    }
}

class FourWheeler extends Vehicle {
    @Override
    void start() {
        System.out.println("Four-wheeler is starting...");
    }
}

public class Transport {
    
    void startVehicle(Vehicle v) {
        v.start(); 
    }

    public static void main(String[] args) {
        Transport t = new Transport();

        Vehicle bike = new TwoWheeler();   
        Vehicle car = new FourWheeler();   

        t.startVehicle(bike);   
    }
}
