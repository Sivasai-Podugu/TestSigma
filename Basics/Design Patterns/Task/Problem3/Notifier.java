package Problem3;

public class Notifier implements Runnable{
    private CriticalSection cs;
    Notifier(CriticalSection cs){
        this.cs = cs;
    }

    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("\u001B[34m"+name+" Started"+ "\u001B[0m");
        
        try {
            Thread.sleep(1000);
            synchronized(cs){
                
                cs.serStr("\n"+name+ " Notifier done its work");
                cs.notify();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
