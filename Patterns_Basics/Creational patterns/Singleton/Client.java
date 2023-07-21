package Singleton;

public class Client {

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                Singleton singleton1 = Singleton.getInstance("Siva");
                System.out.println(singleton1.x);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                Singleton singleton2 = Singleton.getInstance("Sai");
                System.out.println(singleton2.x);
            }
        };

        t1.start();
        t2.start();
        
        // Singleton s1 = Singleton.getInstance("Siva");
        // System.out.println(s1.x);

        // Singleton s2 = Singleton.getInstance("Sai");
        // System.out.println(s2.x);

    }
    
}
