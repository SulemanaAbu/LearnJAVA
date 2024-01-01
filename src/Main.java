import java.util.Scanner;
public class Main{

    public static void main(String [] args) {
        //Switch case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day you were born: ");
        String day = scanner.nextLine();

        switch(day){
            case "Sunday" : System.out.println("You were born on Sunday");
            break;
            case "Monday" : System.out.println("You were born on Monday");
                break;
            case "Tuesday" : System.out.println("You were born on Tuesday");
                break;
            case "Wednesday" : System.out.println("You were born on Wednesday");
                break;
            case "Thursday" : System.out.println("You were born on Thursday");
                break;
            case "Friday" : System.out.println("You were born on Friday");
                break;
            case "Saturday" : System.out.println("You were born on Saturday");
                break;
            default : System.out.println("It is not a day");
        }

    }
}