import java.util.ArrayList;

public class Main{

    public static void main(String [] args) {
      // ForEach loop
       //String [] animals = {"dog", "cat", "sheep", "goat"};
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("sheep");
        animals.add("goat");

       for(String i : animals){
           System.out.println(i);

       }


    }
}