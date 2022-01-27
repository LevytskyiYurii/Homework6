import java.util.Arrays;

class UniqueCharCounter {
    public int count(String phrase) {
        int counter = 0;
        char[] chars = phrase.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (i>0) {
                if (chars[i] != chars[i - 1]) {
                    counter++;
                }
            }else {counter++;}
        }
        return counter;
    }
}
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}