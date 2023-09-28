import java.util.HashMap;
import java.util.Locale;

public class WordCounter {
    public static HashMap<String, Integer> countUniqueWords(String text){
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] wordsArr = text.split(" |\n|\r\n|\\.|\\,|\\?|\\!|\\'|ed|ing|\\(|\\)|;");
        for (int i = 0; i < wordsArr.length;  i++){
            String word = wordsArr[i].toLowerCase(Locale.ROOT);
            if (wordCountMap.containsKey(word)){
                int wordCurrentCount = wordCountMap.get(word);
                wordCountMap.put(word, wordCurrentCount + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }
}
