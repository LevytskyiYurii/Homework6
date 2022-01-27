import java.util.*;

public class WordDeleter {

    public String remove(String phrase, String[] words){
        String[] str = phrase.split("\\s+");
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < str.length; i++) {
            boolean check = false;
            for (int j = 0; j < words.length; j++) {
                if (str[i].equals(words[j])){
                    check = true;
                }
                if (j == words.length-1 && !check){
                    result.add(str[i]);
                }
            }
        }
        return String.join(" ", result);
    }
}
class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}