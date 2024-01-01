
public class Main{

    public static void main(String [] args) {
      // 2D Arrays
        String [][] cars = new String[3][3];

        cars [0][0] = "Camaro";
        cars [0][1] = "Corvette";
        cars [0][2] = "Tesla";

        cars [1][0] = "Sonata";
        cars [1][1] = "Ferrari";
        cars [1][2] = "Civic";

        cars [2][0] = "Range Rover";
        cars [2][1] = "Mustang";
        cars [2][2] = "Lambo";

        for (int i=0; i< cars.length;i++) {
            System.out.println();
            for (int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

            }
        }

    }
}