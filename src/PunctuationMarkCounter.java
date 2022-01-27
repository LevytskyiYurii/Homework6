class PunctuationMarkCounter {
    public int count(String phrase){
        int countMarks = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == '.' ^ phrase.charAt(i) == ',' ^ phrase.charAt(i) == '!' ^ phrase.charAt(i) == ':'^
                    phrase.charAt(i) == ';'){
                countMarks++;
            }
        }
        return countMarks;
    }
}
class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}