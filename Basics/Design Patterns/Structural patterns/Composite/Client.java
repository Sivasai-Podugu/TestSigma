package Composite;

public class Client {
    
    public static void main(String[] args) {
        Department developers = new Department("Developers");
        Employee d1 = new Employee("Kasyap", 100000);
        Employee d2 = new Employee("Manohar", 100000);
        Employee d3 = new Employee("Giresh", 100000);
        developers.addEmployee(d1);
        System.out.println("\u001B[34m"+d1+ "\u001B[0m");
        developers.addEmployee(d2);
        System.out.println("\u001B[34m"+d2+ "\u001B[0m");
        developers.addEmployee(d3);
        System.out.println("\u001B[34m"+d3+ "\u001B[0m");
        
        Department interns = new Department("IIIT Interns");
        Employee e1 = new Employee("Siva", 30000);
        Employee e2 = new Employee("Revanth", 30000);
        Employee e3 = new Employee("Sunil", 30000);
        Employee e4 = new Employee("Divya", 30000);        
        interns.addEmployee(e1);
        System.out.println("\u001B[32m"+e1+ "\u001B[0m");
        interns.addEmployee(e2);
        System.out.println("\u001B[32m"+e2+ "\u001B[0m");
        interns.addEmployee(e3);
        System.out.println("\u001B[32m"+e3+ "\u001B[0m");
        interns.addEmployee(e4);
        System.out.println("\u001B[32m"+e4+ "\u001B[0m");

        // System.out.println("\u001B[31m"+interns+ "\u001B[0m");
        // System.out.println("\u001B[30m"+developers+ "\u001B[0m");
        
        Department testsigma = new Department("Testsigma");
        testsigma.addEmployee(developers);
        testsigma.addEmployee(interns);
        System.out.println("\u001b[35m"+"Total salary for the interns + developers: "+testsigma.getSalary()+"\u001B[0m");

    }
    
}
