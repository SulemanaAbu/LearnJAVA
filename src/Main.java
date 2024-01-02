import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{

    public static void main(String [] args) {
        //Java exception handling
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Enter a whole number to divide: ");
                int x = scanner.nextInt();
                System.out.println("Enter a whole number to divide: ");
                int y = scanner.nextInt();
                int z = x / y;
                System.out.println("result: " + z);
            } catch (ArithmeticException e) {
                    System.out.println("You can't divide by zero! IDIOT");
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number OMG !!!");
            } catch (Exception e) {
                System.out.println("Oops! Something went wrong");
            } finally {
                scanner.close();
            }
        }

    }
}