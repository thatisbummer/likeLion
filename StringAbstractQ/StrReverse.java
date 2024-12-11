package likeLionTestQ.StringAbstractQ;

public class StrReverse {
    public static void main(String[] args) {
        StrReverse str = new StrReverse();
        System.out.println(str.reverseChange("abc"));
        System.out.println(str.reverseChange("Hello"));


    }
        public String reverseChange(String str) {
        String strs = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                strs += str.charAt(i);
            }
            return strs;
    }
}
