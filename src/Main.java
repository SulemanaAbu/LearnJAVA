import java.util.Scanner;
public class Main{

    public static void main(String [] args){
        // JAVA Math Class
        // Finding the hypotenuse of a triangle

        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();

        System.out.println("Enter the value of y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y)) ;
        System.out.println("The value of the hypotenuse is: "+z);

scanner.close();
    }
}