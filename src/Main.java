
public class Main{

    public static void main(String [] args) {
      //Arrays
     //   String [] cars = {"Camaro", "Toyota", "BMW", "Ferrari"};
        String [] cars = new String[4];
        cars[0] = "Camaro";
        cars[1] = "Toyota";
        cars[2] = "BMW";
        cars[3] = "Ferrari";

        // use loops to display all elements in the array
        for (String car : cars) {
            System.out.println(car);
        }
    }
}