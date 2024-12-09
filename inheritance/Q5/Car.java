package likeLionTestQ.inheritance.Q5;

public class Car extends Vehicle{
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void drive() {
        // super.drive();
        System.out.println("자동차가 주행합니다.");
    }
}
