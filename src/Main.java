
public class Main{

    public static void main(String [] args) {
    //Objects array
        Food food1 = new Food("Pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("Hot dog");
        Food[] refrigerator = {food1, food2, food3};

        System.out.println(refrigerator[0].name);

    }
}