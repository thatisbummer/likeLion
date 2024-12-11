package likeLionTestQ.InterfaceAndException.ExceptionQ;

public class TypeCastingE {
    public static void main(String[] args) {
        String numStr = "123a";

        try {
            int num = Integer.parseInt(numStr);
            System.out.println(num);
        }catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값은 변환할 수 없습니다.");
        }

    }
}
