import java.io.File;

public class Main{

    public static void main(String [] args) {
        //Java file class
        File file = new File("C:/Users/saddi/OneDrive/Desktop/secret_message.txt/");

        if (file.exists()){
            System.out.println("That file exists");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());

        }
        else{
            System.out.println("That file does not exist");
        }

    }
}