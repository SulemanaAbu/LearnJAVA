import java.util.Scanner;
public class Main{

    public static void main(String [] args){
        // JAVA Math Class
        // Almighty Formula
        int a;
        int b;
        int c;
        double pos;
        double neg;
        double x1;
        double x2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();
        System.out.println("Enter c: ");
        c = scanner.nextInt();

        pos = -b+Math.sqrt((b*b) - (4*a*c));
        x1 = pos / (2*a);
        neg = -b-Math.sqrt((b*b) - (4*a*c));
        x2 = neg / (2*a);

        System.out.println("The first value is: "+x1);
        System.out.println("The second value is: "+x2);

scanner.close();
    }
}