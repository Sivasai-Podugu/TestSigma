package Problem4;

public class FrenchPinAdapter implements Socket {
    FrenchPin fp = new FrenchPin();
    FrenchPinAdapter(FrenchPin fp){
        this.fp = fp;
    }
    @Override
    public void insert() {
        fp.insertFrenchPin();
        
    }
    
}
