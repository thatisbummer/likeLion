package likeLionTestQ.StringAbstractQ;

public class FindWordChange {
    public static void main(String[] args) {
        System.out.println(replaceAllWords("I like cat. Cat is cute.", "cat", "dog"));
    }

    public static String replaceAllWords(String original, String target, String replacement) {
        return original.replace(target, replacement);
    }
}
