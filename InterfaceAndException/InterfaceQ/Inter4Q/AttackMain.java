package likeLionTestQ.InterfaceAndException.InterfaceQ.Inter4Q;

public class AttackMain {
    public static void main(String[] args) {
        Character character = new Character();


        character.setAttackStrategy(new SwordAttack());

    }
}
