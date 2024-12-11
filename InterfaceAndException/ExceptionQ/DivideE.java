package likeLionTestQ.InterfaceAndException.ExceptionQ;

import java.util.Scanner;

public class DivideE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        DivideE d = new DivideE();
        d.divide(a, b);
    }
    public void divide(int a, int b) {
        try{
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없습니다.");
            System.out.println(e.getMessage());
        }
    }
}
