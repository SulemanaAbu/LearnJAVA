

public class Main{

    public static void main(String [] args) {
     //Java method Overloading
        double x = add(2.45,3.2, 4.30, 2.2);
        System.out.println(x);
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