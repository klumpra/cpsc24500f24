import java.util.ArrayList;
import java.util.Random;
public class RandomWordChooser {
    private Random rnd;
    public RandomWordChooser() {
        rnd = new Random();
    }
    public String chooseWordFromList(ArrayList<String> words) {
        int index = rnd.nextInt(words.size());
        return words.get(index);  // return the randomly selected word
    }
}
