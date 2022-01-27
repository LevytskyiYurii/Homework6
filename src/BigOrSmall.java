class BigOrSmall {

    public String calculate(String text){
        String result = null;
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch>= 'A' && ch <= 'Z' ){
                upperCase++;
            }else if (ch >= 'a' && ch <= 'z')
                lowerCase++;
        }

        if (upperCase>lowerCase){
            result = "Big";
        }else if (lowerCase>upperCase){
            result = "Small";
        } else {result = "Same";
        }
        return result;
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
