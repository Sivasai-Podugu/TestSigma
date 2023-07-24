package Decorator;

class WhippedCreamDecorator implements Coffee {
    private Coffee coffee;

    public WhippedCreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }


    public double getCost() {
        return coffee.getCost() + 15.0; 
    }

    public String getInfo() {
        return coffee.getInfo() + ", Whipped Cream";
    }
}
