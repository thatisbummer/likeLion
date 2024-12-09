package likeLionTestQ.inheritance.Q5;

public class Vehicle {
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    protected String name;
    protected int speed;

    public void drive() {
        System.out.println("차량이 주행합니다.");
    }
}
