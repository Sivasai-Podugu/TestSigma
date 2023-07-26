package Problem3;

public class Waiter implements Runnable{
    private CriticalSection cs;
    Waiter(CriticalSection cs){
        this.cs =cs;
    }
    public void run(){
        String name = Thread.currentThread().getName();
        synchronized(cs){
            try {
                System.out.println(name+" waiting to get notified at time "+System.currentTimeMillis());
                cs.wait();
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+ " waiter thread get notified at time "+System.currentTimeMillis());
            System.out.println(name+" processed" + cs.getStr());
        }
    }
    
    
}
