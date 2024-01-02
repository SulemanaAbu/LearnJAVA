import java.util.Scanner;
public class Main{

    public static void main(String [] args) {
     //Java method Overloading
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a =scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b =scanner.nextDouble();
        System.out.println("Enter number c: ");
        double c =scanner.nextDouble();
        System.out.println("Enter number d: ");
        double d =scanner.nextDouble();
        double x = add(a,b,c,d);
        System.out.println("The sum of your numbers is: "+x);
    }

    static int add(int a, int b){
        System.out.println("This is overloading method #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloading method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloading method #3");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("This is overloading method #4");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloading method #5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloading method #6");
        return a + b + c + d;
    }

}