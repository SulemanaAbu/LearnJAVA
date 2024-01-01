import java.util.Scanner;
public class Main {

    public static void main(String [] args){
        //How to accept input in JAVA
        Scanner accept = new Scanner(System.in);


        System.out.println("what is your name? ");
        String name = accept.nextLine();

        System.out.println("how old are you? ");
        int age = accept.nextInt();
        accept.nextLine();

        System.out.println("what is your favorite food? ");
        String food = accept.nextLine();

        System.out.println("hello "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("you like "+food);

    }
}
