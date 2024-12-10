package likeLionTestQ.StringAbstractQ;

public class StringDigitsSum2 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("abc123"));
        System.out.println(sumOfDigits("a1b2c3d9"));
    }
    public static int sumOfDigits(String str) {
        int result = 0;
        for(char i : str.toCharArray()) {
            if (Character.isDigit(i)) { // 숫자일떄 true 숫자만 판별
                result += Character.getNumericValue(i); //찾은 문자열 숫자를 int로바꿔줌
            }
        }
        return result;
    }
}
