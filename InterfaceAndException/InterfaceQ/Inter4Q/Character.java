package likeLionTestQ.InterfaceAndException.InterfaceQ.Inter4Q;

public class Character {
    Attackable attackStrategy;

    public void setAttackStrategy(Attackable strategy) {
        this.attackStrategy = strategy;
    }
    public void performAttack() {
        attackStrategy.attack();
        
    }
}
