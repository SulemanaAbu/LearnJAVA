
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String [] args) {
        //Java file writer
        try {
            FileWriter writer = new FileWriter("C:/Users/saddi/IdeaProjects/MyFirstProgram/poem.txt");
            writer.write("Roses are red \nViolets are Blue \nBooty booty booty \nRock and roll");
            writer.append("\n(A poem by Bro)");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}