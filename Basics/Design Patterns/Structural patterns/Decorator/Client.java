package Decorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println("\u001B[34m"+"Cost: "+coffee.getCost()+"; Info: "+coffee.getInfo()+ "\u001B[0m");

        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println("\u001B[34m"+"Cost: "+coffeeWithMilk.getCost()+"; Info: "+coffeeWithMilk.getInfo()+ "\u001B[0m");

        Coffee cappuccinoCoffee = new CappuccinoDecorator(coffee);
        System.out.println("\u001B[34m"+"Cost: "+cappuccinoCoffee.getCost()+"; Info: "+cappuccinoCoffee.getInfo()+ "\u001B[0m");

        Coffee coffeeWithCreamAndCaramel = new WhippedCreamDecorator(new CaramelDecorator(coffee));
        System.out.println("\u001B[34m"+"Cost: "+coffeeWithCreamAndCaramel.getCost()+"; Info: "+coffeeWithCreamAndCaramel.getInfo()+ "\u001B[0m");



        
    }
    
}
