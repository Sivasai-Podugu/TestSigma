package Problem5;

public interface Visitor {
    public void visit(Bank bank);
    public void visit(Company company);
    public void visit(Restuarent restuarent);
    public void visit(Resident resident);

}
