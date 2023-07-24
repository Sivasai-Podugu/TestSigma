package Strategy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Context c= new Context();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which strategy to use (DP | Greedy):");
        String s = sc.nextLine();
        if(s.equals("Greedy") ){
            c.setStrategy(new GreedyStrategy());
        }
        else if(s.equals("DP")) {
            c.setStrategy(new DynamicProgrammingStrategy());
        }
        else{
            System.out.println("Undefined strategy....");
        }
        if(s.equals("Greedy") || s.equals("DP") )
            c.executeStrategy("Travelling Salesmen");
        sc.close();
    }
}
