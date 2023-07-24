package Singleton;

public final class Singleton {
    private static volatile Singleton instance;
    public String x;

    private Singleton(String value){
        x = value;
    }

    public static Singleton getInstance(String value){
        Singleton result = instance;
        if(result!=null){
            // result.x = value;
            return result;
        }
        synchronized(Singleton.class){
            if(instance ==null){
                System.out.println("Instance Created");
                instance = new Singleton(value);
            }
            return instance;
        }


    }


    
}
