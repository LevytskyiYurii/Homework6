import java.util.Arrays;
import java.util.StringJoiner;

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
class Phrase{
    private final String[] words;

    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ");
        for (String result: words){
            joiner.add(result);
        }
        return joiner.toString() ;
    }
}