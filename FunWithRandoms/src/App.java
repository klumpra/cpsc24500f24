import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        int num = 1 + rnd.nextInt(6);
        System.out.printf("The number we picked was %d.\n", num);
    }
}
