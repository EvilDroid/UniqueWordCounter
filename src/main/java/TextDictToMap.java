import java.util.HashMap;
import java.util.Locale;

public class TextDictToMap {
    public static HashMap<String, String> makeMap(String text, String delimiter){
        HashMap<String, String> dict = new HashMap<>();
        String[] lines = text.split("\n|\r\n");
        for (String line : lines){
            int firstIndexOfLine = 0;
            int spaceIndex = 0;
            int endlineIndex = 0;

            spaceIndex = line.indexOf(delimiter, firstIndexOfLine);
            endlineIndex = line.length();

            if (spaceIndex != -1){
                dict.put(line.substring(firstIndexOfLine, spaceIndex).trim(), line.substring(spaceIndex, endlineIndex));
            }

        }

        return dict;
    }
}
