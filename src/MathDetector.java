import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MathDetector {

    public boolean isMath(String text){
        boolean result = false;
        Pattern p = Pattern.compile("([0-9])");
        Matcher m = p.matcher(text);

        if ((text.contains("=") || text.contains("-") || text.contains("+") ||
        text.contains("*")|| text.contains("/")) && m.find()){
            result = true;
        }
        return result;
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}