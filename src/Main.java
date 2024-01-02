
public class Main{

    public static void main(String [] args) {
        //Java copy objects
        Car car1 = new Car("Chevrolet","Camaro",2020);
        Car car2 = new Car("BMW", "Mustang",2021);

        car1.copy(car2);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}