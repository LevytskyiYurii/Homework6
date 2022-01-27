public class DoubleSpaceCleaner {
    public String clean(String phrase){
       phrase = phrase.strip();
       phrase = phrase.replaceAll("\\s+", " ");
        return phrase;
    }
}
class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}