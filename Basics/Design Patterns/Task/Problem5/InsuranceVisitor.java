package Problem5;

import java.util.List;

public class InsuranceVisitor implements Visitor {

    

    @Override
    public void visit(Bank bank) {
        System.out.println("Sending mail about the Theft insurance to "+bank.name );
        // TODO
    }

    @Override
    public void visit(Company company) {
        System.out.println("Sending mail about the employees and equipment insurance to "+company.name );
        // TODO
    }

    @Override
    public void visit(Restuarent restuarent) {
        // TODO
        System.out.println("Sending mail about the Fire insurance to "+restuarent.name);
    }

    @Override
    public void visit(Resident resident) {
        System.out.println("Sending mail about the Health insurance to "+ resident.name);
        // TODO
    }
    public void execute(List<Client> clients){
        for (Client client : clients) {
            client.accept(this);
            
        }
        
    }
}
