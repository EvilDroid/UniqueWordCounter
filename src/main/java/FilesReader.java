import java.io.*;

public class FilesReader {

    public static String readFile(String filePath) throws IOException {
        String fileText = "";
        StringBuilder resultStringBuilder = new StringBuilder();

        File file = new File(filePath);
        BufferedReader fileInputStream = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));

        int i;
        while ((i = fileInputStream.read()) != -1) {
            resultStringBuilder.append((char) i);
        }
        fileText = resultStringBuilder.toString();
        return fileText;
    }
}