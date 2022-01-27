import java.util.Locale;

class PalindromeCounter {
    public int count(String phrase){
        int counter = 0;
        String[] words = phrase.toLowerCase().split(" ");
        for (String word:words) {
        char[] chars = new char[word.length()];
            for (int i = 0; i < chars.length; i++) {
                chars[i] = word.charAt(i);
            }
        if ((chars[0] == chars[chars.length-1]) & (chars[1] == chars[chars.length-2])){
            counter++;
        }
        }
        return counter;
    }
}
class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}