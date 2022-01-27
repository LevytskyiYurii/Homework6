import java.util.regex.Pattern;

class DigitText {
    public boolean detect(String text){
        text = text.replaceAll("\\s+", "");
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)\\s+?");
        if (text == null) {
            return false;
        }
        return pattern.matcher(text).matches();
    }
}
class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}