package likeLionTestQ.InterfaceAndException.ExceptionQ;

public class StrlenE {
    public static void main(String[] args) {
        String str = null;

        try {
            int len = str.length();
            System.out.println(len);
        }catch (NullPointerException e) {
            System.out.println("문자열이 null 상태입니다.");
        }
    }
}
