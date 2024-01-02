public class Friend {
    String name;
    static int numberOffriends;
    Friend(String name){
        this.name = name;
        numberOffriends++;
    }
    static void showFriends(){
        System.out.println("You have "+numberOffriends+" friends");
    }
}
