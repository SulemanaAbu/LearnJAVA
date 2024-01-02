
public class Main{

    public static void main(String [] args) {
     //OBJECT ORIENTED PROGRAMMING
        Car myCar = new Car();
        System.out.println("The color: "+myCar.color);
        System.out.println("The name: "+myCar.make);
        System.out.println("The color: "+myCar.color);
        System.out.println("The model: "+myCar.model);
        System.out.println("The price: "+myCar.price);
        System.out.println("The year: "+myCar.year);

        myCar.drive();
        myCar.brake();



    }
}