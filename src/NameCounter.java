class NameCounter {
    public int count(String text) {
        String[] newText = text.split(" ");

        int count = 0;
        for (String part : newText) {
            char[] arrPart = part.toCharArray();

            String s = new String(arrPart);
            char first = s.charAt(0);
            char second = s.charAt(1);

            if (Character.isUpperCase(first) && Character.isLowerCase(second) && arrPart.length >= 2) {
                count++;
            }
        }
        return count;
    }
}
class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));
        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));
        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}