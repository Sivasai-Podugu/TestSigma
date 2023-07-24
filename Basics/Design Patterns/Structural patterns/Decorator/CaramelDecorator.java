package Decorator;

class CaramelDecorator implements Coffee {
    private Coffee coffee;

    public CaramelDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20.0; // Additional cost for caramel
    }

    @Override
    public String getInfo() {
        return coffee.getInfo() + ", Caramel";
    }
}
