import java.util.Locale;

class WordCombine {

    public boolean canCombine(String sourceWord, String targetWord){
        sourceWord = sourceWord.toLowerCase(Locale.ROOT);
        targetWord = targetWord.toLowerCase(Locale.ROOT);
        boolean combines = false;
        char[] source = sourceWord.toCharArray();
        char[] target = targetWord.toCharArray();
        for (char c : source) {
            for (char value : target) {
                if (c == value) {
                    combines = true;
                    break;
                }
            }
        }
        return combines;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}