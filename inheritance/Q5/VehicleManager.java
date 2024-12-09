package likeLionTestQ.inheritance.Q5;

public class VehicleManager {
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[2];

        v[0] = new Car("카이엔", 300);
        v[1] = new Bike("마이하히!", 350);

        for (Vehicle vehicle: v) {
            vehicle.drive();
        }

    }
}
