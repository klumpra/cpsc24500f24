import java.util.Random;
import java.util.Scanner;
/**
 * This application generates 10 random integers.
 * It then allows you to find the min, max, and mean of those integers.
 * The ints will be stored in an array
 */
public class App {

    public static void printMenu() {
        System.out.println("Here are your options: ");
        System.out.println("1. Print the numbers one per line.");
        System.out.println("2. Calculate the sum");
        System.out.println("3. Quit");
        System.out.print("Enter your choice: ");
    }
    public static void printNumbers(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static int calculateSum(int[] nums) {
        return 0;
    }
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100);
        }
        int choice, sumOfNumbers;
        do {
            printMenu();
            choice = sc.nextInt();
            if (choice == 1) {
                printNumbers(numbers);
            } else if (choice == 2) {
                sumOfNumbers = calculateSum(numbers);
            }
        } while (choice != 3);
    }
}
