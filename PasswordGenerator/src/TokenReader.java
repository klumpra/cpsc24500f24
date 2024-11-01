import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class TokenReader {   // like WordFileReader
    public static LinkedHashMap<String,ArrayList<String>> readTokensFromFile(String fileName) {
        try {
            LinkedHashMap<String,ArrayList<String>> result = new LinkedHashMap<String,ArrayList<String>>();
            Scanner fsc = new Scanner(new File(fileName));
            String line, word, category;
            String[] parts;
            ArrayList<String> theList;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();  // trim to help us detect empty lines
                if (line.isEmpty()) {
                    continue;   // skip the empty line
                }
                parts = line.split("\t");   // \t means tab
                word = parts[0];
                category = parts[1];
                if (!result.containsKey(category)) {  // it's not in the linked hash map yet - so there's no array list
                    result.put(category, new ArrayList<String>());  // initializes the place we'll store this kind of thing
                }
                theList = result.get(category);
                theList.add(word);
/*  col --> ArrayLIst containing all colors
 *  sym --> ArrayList containing all symbols
 */
            }
            fsc.close();
            return result;
        } catch (Exception ex) {
            return null;   // indicate that I failed
        }
    }
}
