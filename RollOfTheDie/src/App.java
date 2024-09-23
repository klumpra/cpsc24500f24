// This program allows a person to roll 1 or 2 die
// It first asks them if they want to roll.
// It then asks them if they want one or two rolls.
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int roll1, roll2, rollCount;
        System.out.print("Do you want to play a game of chance? ");
        String wannaPlay = sc.next();
        if (wannaPlay.equalsIgnoreCase("yes") || wannaPlay.equalsIgnoreCase("y")
        || wannaPlay.equalsIgnoreCase("sure")) {
            System.out.print("Roll once or twice? Enter 1 for once, 2 for twice: ");
            rollCount = sc.nextInt();
            if (rollCount != 1 && rollCount != 2) {
                System.out.println("You answered incorrectly. Off with you!");
            } else {
                roll1 = 1 + rnd.nextInt(6);
                System.out.printf("You rolled a %d.\n", roll1 );
                if (rollCount == 2) {
                    roll2 = 1 + rnd.nextInt(6);
                    System.out.printf("You then rolled a %d.\n", roll2);
                }
            }
        } else {
            System.out.println("You are lame. Go home.");
        }
    }
}
