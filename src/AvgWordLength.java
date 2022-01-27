import java.util.*;

class AvgWordLength {
    public double count(String phrase){
        String[] words = phrase.split("\\s+");
        double wordsCount = words.length;
        String phrase1 = phrase.replaceAll(" ", "");
        char[] letters = phrase1.toCharArray();
        double lettersCount = letters.length;

        double result = lettersCount / wordsCount;
        return result;
    }

}
class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}