package Decorator;

class  CappuccinoDecorator implements Coffee{
    private Coffee coffee;

    public CappuccinoDecorator(Coffee c){
        coffee = c;
    }

    public double getCost(){
        return coffee.getCost()+10.0d;
    }

    public String getInfo(){
        return coffee.getInfo()+", Cappuccino" ;
    }
    
}
