class WaterCounter {

    public double count(String text){
        double result = 0;
        char[] symbols = text.toCharArray();

        for (char c : symbols) {
            if (c == ' '){
                result++;
            }
        }
        return result / symbols.length;
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}