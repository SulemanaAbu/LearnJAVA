import java.util.Scanner;
public class Main {

    public static void main(String [] args){
        Scanner take = new Scanner(System.in);

        System.out.println("What is the name of your company? ");
        String name = take.nextLine();

        System.out.println("How long have you been working there? ");
        int age = take.nextInt();
        take.nextLine();

        System.out.println("Name of your reference: ");
        String reference = take.nextLine();

        System.out.println("Position of reference: ");
        String position = take.nextLine();


        System.out.println("You work at "+name);
        System.out.println("You have been working there for "+age+" years");
        System.out.println(reference+" is your reference");
        System.out.println(reference+" is the "+position);
    }
}
