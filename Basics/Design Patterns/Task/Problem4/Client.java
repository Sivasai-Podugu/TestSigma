package Problem4;

public class Client {
    public static void main(String[] args) {
        IndianPin ip =new IndianPin();
        FrenchPin fp = new FrenchPin() ;
        AmericanPin ap = new AmericanPin();

        Socket sc;

        sc = new IndianPinAdapter(ip);
        sc.insert();

        sc = new FrenchPinAdapter(fp);
        sc.insert();

        sc = new AmericanPinAdapter(ap);
        sc.insert();
        



    }
    
}
