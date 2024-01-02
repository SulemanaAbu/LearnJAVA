import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String [] args) {
        //Java file reader
        try {
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();
            while(data!=-1){
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}