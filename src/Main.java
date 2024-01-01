import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main{

    public static void main(String [] args){
        //If and else statements
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        System.out.println("Your score is "+score);

        // Grade determination
        if (score > 100) {
            System.out.println("Error checking grade!");
        }
        else if (score < 0) {
            System.out.println("Error checking grade!");
        }
        else if (score >= 80) {
            System.out.println("Your grade is A");
        }
        else if (score >= 70){
            System.out.println("Your grade is B");
        }
        else if (score >= 60){
            System.out.println("Your grade is C");
        }
        else if (score >= 50){
            System.out.println("Your grade is D");
        }
        else if (score >= 40){
            System.out.println("Your grade is E");
        }
        else{
            System.out.println("Your grade is F");
        }
    }
}