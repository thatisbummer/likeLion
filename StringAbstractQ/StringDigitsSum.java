package likeLionTestQ.StringAbstractQ;

public class StringDigitsSum {
    public static void main(String[] args) {
        StringDigitsSum s = new StringDigitsSum();

        System.out.println(s.sumOfDigits("abc123"));
        System.out.println(s.sumOfDigits("a1b2c3d9"));

    }
    public int sumOfDigits(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                result += str.charAt(i) - '0';
            }
        }
        return result;
    }
}
