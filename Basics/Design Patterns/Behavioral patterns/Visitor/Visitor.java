package Visitor;

public interface Visitor {
    public void visit(Mobile mobile);
    public void visit(Laptop laptop);
    public void visit(Clothes clothes);

}
