package Problem4;

public class IndianPinAdapter implements Socket{

    IndianPin ip = new IndianPin();
    IndianPinAdapter(IndianPin ip){
        this.ip = ip;
    }
    @Override
    public void insert() {
        ip.insertIndianPin();
        
    }
    
}
