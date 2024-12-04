import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFileReader {
    public static ArrayList<String> readWords(File f) {
        try {
            ArrayList<String> result = new ArrayList<String>();
            Scanner fsc = new Scanner(f);
            String line;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();
                if (line.length() == 0) {
                    continue;
                }
                result.add(line);  // adds the word to the word list.
            }
            fsc.close();
            return result;
        } catch (Exception ex) {
            return null;
        }
        
    }
}
