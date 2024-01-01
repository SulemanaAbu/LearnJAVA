import java.util.Scanner;

public class Main{

    public static void main(String [] args) {
        //AND OR NOT logical operators
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.nextLine();

        if (response.equals("q") || response.equals("Q") ){
            System.out.println("You have quit the game ");
        }
        else{
            System.out.println("Enter q or Q to quit the game");
        }



    scanner.close();
    }
}