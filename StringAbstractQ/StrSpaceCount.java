package likeLionTestQ.StringAbstractQ;

public class StrSpaceCount {
    public static void main(String[] args) {
        spaceCount("test tset ts tt t");
        spaceCount("te st ts et t s tt t");
        alphaCount("test tset ts ttt t");
        alphaCount("test tsddet ts ttt t");
    }
    public static void spaceCount(String str) {
        int count = 0;
        for (char strs : str.toCharArray()) {
            if (Character.isWhitespace(strs))
                count++;
        }
        System.out.println(count);
    }
    public static void alphaCount(String str) {
        int count = 0;
        for (char strs : str.toCharArray()) {
            if (Character.isLetter(strs)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
