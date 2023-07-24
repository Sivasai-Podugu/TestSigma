package Factory;

public abstract class ChargerFactory {
    public abstract Charger createCharger();
    public void useCharger(){
        Charger ch = createCharger();
        ch.plugIn();
        ch.plugOut();
    }
}
