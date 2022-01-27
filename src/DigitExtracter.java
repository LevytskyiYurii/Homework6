import java.util.*;

class DigitExtracter {
    public int[] extract(String text){
        int count = 0;
        text = text.replaceAll("[^\\d]", " ");
        text = text.trim();
        text = text.replaceAll(" +", "");
        char[] res = text.toCharArray();


        int[] result = new int[text.length()];
        for (int i = 0; i < res.length; i++) {
            result[i] = Character.digit(res[i], 10);
            }
        return result;
    }
    }

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}