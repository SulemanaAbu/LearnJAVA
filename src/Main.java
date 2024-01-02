
public class Main{

    public static void main(String [] args) {
        //Encapsulation
        Car car = new Car("Chevrolet","Camaro", 2020);
        //Setters
        car.setYear(2021);
        car.setMake("Tesla");
        car.setModel("Doge");
        //Getters
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());



    }
}