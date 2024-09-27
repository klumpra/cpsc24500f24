import java.util.Scanner;
/**
 * This program asks the user for their name and age and then classifies their age
 * and tells them about it.
 */
public class App {
    /**
     * Takes in an integer age and returns a string description
     * @param age the age we want to describe
     * @return a string description of the person's age
     */
    public static String classifyAge(int age) {
        int result;
        if (age < 18) {
            return "You are a child.";
        } else if (age < 30) {
            return "You are a young adult.";
        } else if (age < 50) {
            return "You are getting sick of adulting.";
        } else if (age < 65) {
            return "Time is ticking.";
        } else {
            return "Your better days are long behind you.";
        }
    }
    /**
     * The main method for the application.
     * @param args command-line parameter
     * @throws Exception when all hell breaks loose
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
//        App me = new App();
//        String description = me.classifyAge(age);
        String description = classifyAge(age);
        System.out.println(description);
    }
}
