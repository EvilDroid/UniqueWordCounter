import java.io.IOException;
import java.util.HashMap;

public class UniqueWordCounter {

    private static final String RESOURSES_PATH = "C:\\Users\\aikel\\IdeaProjects\\UniqueWordCounter\\src\\main\\resources\\";
    public static void main(String[] args) throws IOException {
        System.out.println("Program starts!");

        String fileName = "TextToRead.txt";
        String dictionaryFile = "Mueller.txt";
        String outFile = "Out.txt";
        String fileText = FilesReader.readFile(RESOURSES_PATH + fileName);

        String dictString = FilesReader.readFile(RESOURSES_PATH + dictionaryFile);
        HashMap<String, String> dict = TextDictToMap.makeMap(dictString, "  ");

        HashMap <String, Integer> wordsCountMap = WordCounter.countUniqueWords(fileText);
        System.out.println("Count of unique words: " + wordsCountMap.keySet().size());
//        for (String word : wordsCountMap.keySet()) {
//            System.out.println("Word: " + word + " -> count: " + wordsCountMap.get(word));
//        }


        HashMap <String, String> wordsWithTranslate = new HashMap<>();
        for (String word : wordsCountMap.keySet()) {
            wordsWithTranslate.put(word, dict.get(word));
        }

        System.out.println("--------------Translate----------------");
        for (String word : wordsWithTranslate.keySet()) {
            String out = wordsCountMap.get(word) + " " + word + " -> " + wordsWithTranslate.get(word);
            System.out.println(out);
            FilesWriter.writeFile(RESOURSES_PATH + outFile, out);
        }



        System.out.println("Program ends");
    }
}
