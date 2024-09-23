import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are a child.");
        } else if (age < 30) {
            System.out.println("You are a young adult.");
        } else if (age < 50) {
            System.out.println("Adulting sucks, doesn't it?");
        } else if (age < 65) {
            System.out.println("Bet you can't wait to retire?");
        } else {
            System.out.println("Your bones ache.");
        }
    }
}
