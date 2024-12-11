package likeLionTestQ.InterfaceAndException.InterfaceQ.Inter3QCal;

public class AdvancedCalculator implements Multipliable, Calculator{
    @Override
    public int multiply(int a, int b) {

        return a * b;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
