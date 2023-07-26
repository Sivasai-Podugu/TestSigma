package Problem3;

public class Client {
    public static void main(String[] args) {
        CriticalSection cs = new CriticalSection("Testsigma");
        Waiter waiter1 = new Waiter(cs);
        new Thread( waiter1, "Waiter1").start();
        Waiter waiter2 = new Waiter(cs);
        new Thread( waiter2, "Waiter2").start();
        Notifier notifier = new Notifier(cs);
        new Thread( notifier, "Notifier").start();
    }   
}
