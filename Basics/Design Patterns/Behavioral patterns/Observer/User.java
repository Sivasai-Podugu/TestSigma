package Observer;

public class User {
    private String name;
    User(String s){
        name = s;
    }
    public void update(String recentMsg){
        System.out.println("Hey "+name+"! You have new message i.e., "+recentMsg);
    }
}
