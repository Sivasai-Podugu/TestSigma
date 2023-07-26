package Problem5;

import java.util.ArrayList;
import java.util.List;

public class ClientCode {
    public static void main(String[] args) {
        List <Client> clients = new ArrayList<>(); 
        Client bank = new Bank("SBI", "Andhrapradesh", "9876543210",10);
        Client restuarent = new Restuarent("Redbucket", "Hyderabad", "9879876540",7 );
        Client company = new Company("Testsigma", "Bangalore", "9768484987", 120);
        Client resident = new Resident("Siva", "Andhrapradesh", "9603650318", 4);

        clients.add(bank);
        clients.add(company);
        clients.add(restuarent);
        clients.add(resident);

        InsuranceVisitor visitor = new InsuranceVisitor();
        visitor.execute(clients);

    }
}
