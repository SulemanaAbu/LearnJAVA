
public class Main{

    public static void main(String [] args) {
    //Objects passing

        Garage garage = new Garage();
        Car car1 = new Car("Ferrari");
        Car car2 = new Car("BMW");

        Bicycle bicycle1 = new Bicycle("Mongoose");
        Bicycle bicycle2 = new Bicycle("BMX");

        garage.park(car1);
        garage.park(car2);

        garage.chock(bicycle1);
        garage.chock(bicycle2);

    }
}