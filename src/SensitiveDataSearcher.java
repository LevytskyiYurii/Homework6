class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase){
        phrase = phrase.replaceAll(":", "");
        phrase = phrase.replaceAll(";", "");
        phrase = phrase.replaceAll(",", "");
        phrase = phrase.replaceAll("\\.", "");
        phrase = phrase.replaceAll("'", "");
        String[] words = phrase.split("\\s+");
        boolean result = false;
        for (String word:words) {

            if (word.equalsIgnoreCase("login")^word.equalsIgnoreCase("pass")
                ^word.equalsIgnoreCase("key")^word.equalsIgnoreCase("email")){
            result = true;
            }
        }
        return result;
    }

}
class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}