import java.util.Random;
import java.util.Scanner;
/**
 * This application generates 10 random integers.
 * It then allows you to find the min, max, and mean of those integers.
 * The ints will be stored in an array
 */
public class App {

    /**
     * Prints the menu.
     */
    public static void printMenu() {
        System.out.println("Here are your options: ");
        System.out.println("1. Print the numbers one per line.");
        System.out.println("2. Find the sum");
        System.out.println("3. Find the minimum");
        System.out.println("4. Find the maximum");
        System.out.println("5. Find the mean");
        System.out.println("6. Quit");
        System.out.print("Enter your choice: ");
    }
    /**
     * Prints the numbers in the nums array one per line
     * @param nums - list of numbers to be printed
     */
    public static void printNumbers(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }
    /**
     * Calculates the sum of the values in the nums array
     * @param nums - the list of values to add up
     * @return their sum
     */
    public static int findSum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
    /**
     * Finds the minimum of the values in nums
     * @param nums - the list to search through for the minimum
     * @return - the minimum value
     */
    public static int findMin(int[] nums) {
        int theMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < theMin) {
                theMin = nums[i];
            }
        }
        return theMin;
    }
    /**
     * Finds the maximum of the values in nums
     * @param nums - the list to search through for the maximum
     * @return - the maximum value
     */
    public static int findMax(int[] nums) {
        int theMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > theMax) {
                theMax = nums[i];
            }
        }
        return theMax;
    }
    /**
     * Finds the arithmetic mean of the values in nums
     * @param nums - the numbers we're computing the mean for
     * @return the mean
     */
    public static double findMean(int[] nums) {
        return (double)findSum(nums)/nums.length;
    }
    /**
     * This builds and loads the array of random numbers
     * @param numNums - how many numbers
     * @param valCap - the maximum value to generate
     * @return the array with numNums slots, each filled with a number [0,valCap)
     */
    public static int[] buildNumbersArray(int numNums, int valCap) {
        Random rnd = new Random();
        int[] result = new int[numNums];
        for (int i = 0; i < result.length; i++) {
            result[i] = rnd.nextInt(valCap);
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want? ");
        int howMany = sc.nextInt();
        System.out.print("What is the maximum value to generate? ");
        int maxVal = sc.nextInt();
        int[] numbers = buildNumbersArray(howMany, maxVal);
        int choice, sumOfNumbers, theMin, theMax;
        double theMean;
        do {
            printMenu();
            choice = sc.nextInt();
            if (choice == 1) {
                printNumbers(numbers);
            } else if (choice == 2) {
                sumOfNumbers = findSum(numbers);
                System.out.printf("The sum of the numbers is %d.\n", sumOfNumbers);
            } else if (choice == 3) {
                theMin = findMin(numbers);
                System.out.printf("The minimum is %d.\n",theMin);
            } else if (choice == 4) {
                theMax = findMax(numbers);
                System.out.printf("The maximum is %d.\n",theMax);
            } else if (choice == 5) {
                theMean = findMean(numbers);
                System.out.printf("The mean is %.2f.\n",theMean);
            } else if (choice != 6) {
                System.out.println("That wasn't a valid choice.");
            }
        } while (choice != 6);
        System.out.println("Have a nice day.");
    }
}
