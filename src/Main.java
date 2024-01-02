import java.util.Scanner;
public class Main{

    public static void main(String [] args) {
        //Dynamic Polymorphism

        Scanner scanner  = new Scanner(System.in);
        Animal  animal   = new Animal();
        Animal  animal1  = new Dog();
        Animal  animal2  = new Cat();

        System.out.println("What animal do you want? ");
        System.out.println("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if (choice==1){
           animal1.speak();
        }
        else if(choice==2){

            animal2.speak();
        }
        else{
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}