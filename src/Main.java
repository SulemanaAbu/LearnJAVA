import java.util.ArrayList;

public class Main{

    public static void main(String [] args) {
      // arraylists
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot dog");

        for(int i=0; i<food.size(); i++ ){
            System.out.println(food.get(i));

        }


    }
}