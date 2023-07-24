package Strategy;

public class Context {

    private Strategy startegy ;

    void setStrategy(Strategy strategy){
        this.startegy = strategy;
    }
    
    void executeStrategy(String problem){
        startegy.execute(problem);
    }
    
}
