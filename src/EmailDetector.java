class EmailDetector {

    public boolean isPresent(String text){
        String email = null;

        String[] words = text.split(" ");
        for (String word : words) {
            if (word.contains("@")) {
                email = word;
                if (email.length() > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}