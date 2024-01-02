
public class Main{

    public static void main(String [] args) {
    //Inheritance
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        Bicycle bicycle = new Bicycle();


        car.go();
        bicycle.stop();
        System.out.println(car.doors);

    }
}