
public class Main{

    public static void main(String [] args) {
        //Polymorphism
        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        Vehicle [] racers = {car, bike, boat};
        for (Vehicle v : racers){
            v.go();
        }

    }
}