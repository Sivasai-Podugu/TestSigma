package Composite;

public class Employee implements Component {
    private String name;
    private double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
    
    public String toString(){
        return "\u001B[34m"+"Emp name: "+name+"; salary: "+salary+ "\u001B[0m" ;
    }
}
