package Problem4;

public class AmericanPinAdapter implements Socket {
    AmericanPin ap = new AmericanPin();
    AmericanPinAdapter(AmericanPin ap){
        this.ap = ap;
    }
    @Override
    public void insert() {
        ap.insertAmericanPin();
        
    }
    
}
