package Observer;

public class Client {
    public static void main(String[] args) {
        User u0 = new User("Siva");
        User u1 = new User("Jaan");
        User u2 = new User("Sai");
        User u3 = new User("Sunil");
        User u4 = new User("Revanth");

        Whatsapp group = new Whatsapp("IIITians"); 
        group.addUser(u0);
        group.addUser(u1);
        group.addUser(u2);
        group.addUser(u3);
        group.addUser(u4);

        group.setRecentMsg("Hii Friends, Tomorrow we have to meet");
    }
    
}
