package likeLionTestQ.inheritance.Q5;

public class Bike extends Vehicle{
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void drive() {
        // super.drive();
        System.out.println("오토바이가 주행합니다.");
    }
}
