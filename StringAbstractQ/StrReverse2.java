package likeLionTestQ.StringAbstractQ;

public class StrReverse2 {
    public static void main(String[] args) {
        StrReverse2 str = new StrReverse2();

        System.out.println(str.reverseChange("abc"));
        System.out.println(str.reverseChange("Hello"));
    }
    public String reverseChange(String str) {
        StringBuilder strB = new StringBuilder(str); //입력된 문자열을 StringBuilder 객체에 저장

        return strB.reverse().toString();
    }
}
