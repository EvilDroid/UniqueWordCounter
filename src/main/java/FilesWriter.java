import java.io.*;

public class FilesWriter {

    public static void writeFile(String outFile, String out) {

        try {
            FileWriter myWriter = new FileWriter(outFile, true);
            myWriter.write(out);
            myWriter.write("\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}