package likeLionTestQ.InterfaceAndException.InterfaceQ.Inter3QCal;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new BasicCalculator();
        Calculator mulCal = new AdvancedCalculator();

        Multipliable Ad = new AdvancedCalculator();

        System.out.println(Ad.multiply(1,2));
        System.out.println(mulCal.add(1,3));
        System.out.println(mulCal.subtract(5,1));
        System.out.println(cal.subtract(5,4));
        System.out.println(cal.add(4,1));
    }
}
