import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your full name: ");
        sc.nextLine();  // clears the end of line character left over by nextInt
        String name = sc.nextLine();  
        int ageInMonths = age * 12;
        System.out.printf("Hi, %s. You are %d months old.\n", name, ageInMonths);
    }
}
