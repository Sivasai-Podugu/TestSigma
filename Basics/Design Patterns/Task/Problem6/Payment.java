package Problem6;

public interface Payment {
    public int credit(int amount, int balance);
    public int debit(int amount, int balance);
}
