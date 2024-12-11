package likeLionTestQ.StringAbstractQ;

public class WordCount {
    public static void main(String[] args) {
        WordCount count = new WordCount();

        int result = count.countChar("banana", 'n');
        System.out.println(count.countChar("banana", 'n'));
        System.out.println(result);
    }

    public int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
