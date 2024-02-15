interface Vehicle{
    void Start(int currSpeed);
    void Stop();
}

class Car implements Vehicle{
    int currSpeed;

    public void Start(int currSpeed) {
        this.currSpeed = currSpeed;
        System.out.println("Start Car");
    }

    public void Stop() {
        System.out.println("Stop Car from speed: " + currSpeed + " to 0.");
    }

}

class Motorcycle implements Vehicle{
    int currSpeed;
    
    public void Start(int currSpeed) {
        this.currSpeed = currSpeed;
        System.out.println("Start Motorcycle");
    }

    public void Stop() {
        System.out.println("Stop Motorcycle from speed: " + currSpeed + " to 0.");
    }
}

class Truck implements Vehicle{
    int currSpeed;

    public void Start(int currSpeed) {
        this.currSpeed = currSpeed;
        System.out.println("Start Truck");
    }

    public void Stop() {
        System.out.println("Stop Truck from speed: " + currSpeed + " to 0.");
    }

}

public class DriveVehicle{
    public static void main(String[] args){
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();
        Truck myTruck = new Truck();

        myCar.Start(60);
        myMotorcycle.Start(90);
        myTruck.Start(30);

        myCar.Stop();
        myMotorcycle.Stop();
        myTruck.Stop();
    }
}