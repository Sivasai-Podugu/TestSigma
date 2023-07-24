package Composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements Component{
    String name;
    List<Component  > emplist;

    Department(String name){
        this.name = name;
        emplist = new ArrayList<>();
    }

    public void addEmployee(Component emp){
        emplist.add(emp);

    }

    public void removeEmployee(Component emp){
        emplist.remove(emp);
    }

    public double getSalary(){
        double total =0.0d;
        for (Component component : emplist) {
            total +=component.getSalary();
        }
        return total;
    }

    public String toString(){
        return "\u001B[32m"+"name: "+name+ "\u001B[0m" ;
    }
    
}
