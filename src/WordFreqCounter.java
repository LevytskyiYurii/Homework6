class WordFreqCounter  {
    public float countFreq(String phrase, String word) {
        String phraseLowCase= phrase.toLowerCase();
        String wordLowCase=word.toLowerCase();
        String[] phraseArr = phraseLowCase.split("\\s+");
        float count = 0f;
        float phraseLength = phraseArr.length;

        for (int i = 0; i < phraseArr.length; i++) {
            if (phraseArr[i].equals(wordLowCase)) {
                count++;
            }
        }
        return count/phraseLength;
    }
}


class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}