import java.util.Scanner;
/**
 * This program calculates the area of circles and rectangles.
 * It illustrates using a menu with a do loop
 */
public class App {

    /**
     * This method prints a welcome banner
     */
    public static void printHeading() {
        System.out.println("**********************************************");
        System.out.println("            AREA CALCULATOR v1.0");
        System.out.println("**********************************************");
        System.out.println();
    }
    public static void printMenu() {
        System.out.println("What kind of shape do you want?");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Quit");
        System.out.print("Enter the number of your choice: ");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        printHeading();
        int choice = 0;
        double radius, area, width, length;
        do {
            printMenu();
            while (choice == 0) {
                try {
                    choice = sc.nextInt();
                } catch (Exception ex) {
                    System.out.println("You needed to enter an integer.");
                    choice = 0;
                    sc.nextLine();  // clear the input channel of the garbage that's currently on it.
                }
            }
            if (choice == 1) {
                System.out.print("Enter the circle's radius: ");
                radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                System.out.printf("The circle with radius %.2f has area %.2f.\n", radius, area);
            } else if (choice == 2) {
                System.out.print("Enter the width and length of the rectangle: ");
                width = sc.nextDouble();
                length = sc.nextDouble();
                area = width * length;
                System.out.printf("The rectangle with width %.2f and length %.2f has area %.2f.\n",width, length, area);
            } else if (choice != 3) {
                System.out.println("You need to follow directions. That is not a recognized choice.");
            }
        } while (choice != 3);
        System.out.println("Goodbye. Have a nice life.");
    }
}
