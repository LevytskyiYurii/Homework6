class SummaryCreator {
    public String create(String text){
        if (text.length() <= 15) {
            return text;
        }else if (text.charAt(15) == ' '){
            text = text.substring(0, 15);
        } else {
            text = text.substring(0, 15) + "...";
        }
        return text;
    }
}
class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));

        // arlebasoleguxys
        String longPhrase2 = "arlebasoleguxys ipg";
        System.out.println(summaryCreator.create(longPhrase2));
    }

}