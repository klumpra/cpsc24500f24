import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;

public class PasswordGenerator {
    private LinkedHashMap<String,ArrayList<String>> tokens;
    private Random rnd;
    private int symbolChance;  // how likely a symbol will be included
    private int numberChance;  // how likely a number will be included
    public int getSymbolChance() {
        return symbolChance;
    }
    public int getNumberChance() {
        return numberChance;
    }
    public void setSymbolChance(int sc) {
        if (sc > 10) {
            symbolChance = 10;
        } else if (sc < 0) {
            symbolChance = 0;
        } else {
            symbolChance = sc;
        }
    }
    public void setNumberChance(int nc) {
        if (nc > 10) {
            numberChance = 10;
        } else if (nc < 0) {
            numberChance = 0;
        } else {
            numberChance = nc;
        }        
    }
    public PasswordGenerator() {
        this(null,0,0);   // not much we can do 
    }
    public PasswordGenerator(LinkedHashMap<String,ArrayList<String>> tokens) {
        this(tokens,5,5);   // 50% chances by default for numbers and symbols
    }
    public PasswordGenerator(LinkedHashMap<String,ArrayList<String>> tokens, int symbolChance, int numberChance) {
        this.tokens = tokens;
        setSymbolChance(symbolChance);
        setNumberChance(numberChance);
        rnd = new Random();
    }
    public String chooseToken(String category) {
        ArrayList<String> theList;
        if (tokens.containsKey(category)) {
            theList = tokens.get(category);
            return theList.get(rnd.nextInt(theList.size()));  // randomly selected entry in the list
        } else {
            return "";
        }
    }
    /**
     * This generates and returns a list of passwords
     * @param count - how many
     * @return ArrayLIst of generated passwords
     */
    public ArrayList<String> generatePasswords(int count) {
        if (tokens == null) {
            return null;
        }
        ArrayList<String> result = new ArrayList<String>();
        String password;
        int decider;
        // each password is a color followed by maybe a symbol followed by a shape followed by a bbt followed by maybe a number
        for (int i = 0; i < count; i++) {
            password = chooseToken("col"); // randomly chooses a color
            decider = rnd.nextInt(10);   // helps us decide whether to include a symbol
            if (decider < symbolChance) {
                password = password + chooseToken("sym");
            }
            password = password + chooseToken("shp") + chooseToken("bbt");
            decider = rnd.nextInt(10);
            if (decider < numberChance) {
                password = password + chooseToken("num");
            }
            result.add(password);
        } 
        return result;       
    }
}
