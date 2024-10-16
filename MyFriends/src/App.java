import java.util.ArrayList;
import java.util.Scanner;
/**
 * Maintains a list of friends' names using an ArrayList
 */
public class App {
    public static void printMenu() {
        System.out.println("Here are your options:");
        System.out.println("1. Add a friend");
        System.out.println("2. Remove a friend");
        System.out.println("3. List friends");
        System.out.println("4. Find a frined");
        System.out.println("5. Exit");
        System.out.print("Enter the number of your choice: ");
    }
    public static void printFriends(ArrayList<String> friends) {
        for (String friend : friends) {
            System.out.println(friend);
        }
/*
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
*/
    }
    /**
     * Returns the place in the arraylist where the name was found, or -1 if not found
     * @param friends - the list of friends' names
     * @param toFind - the name to find
     * @return -1 if not found; position if found
     */
    public static int findFriend(ArrayList<String> friends, String toFind) {
        return friends.indexOf(toFind);
    }
    public static void main(String[] args) throws Exception {
        ArrayList<String> friends = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String friendName;
        int foundAt;
        do {
            printMenu();
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter the name of the friend to add: ");
                sc.nextLine();
                friendName = sc.nextLine();
                friends.add(friendName);
            } else if (choice == 2) {
                System.out.print("Enter the name of the person whose politics you disagee with: ");
                sc.nextLine();
                friendName = sc.nextLine();
                friends.remove(friendName);
            } else if (choice == 3) {
                printFriends(friends);
            } else if (choice == 4) {
                System.out.print("Enter the friend to find: ");
                sc.nextLine();
                friendName = sc.nextLine();
                foundAt = findFriend(friends,friendName);
                if (foundAt < 0) {
                    System.out.println("Not found");
                } else {
                    System.out.printf("Found at %d.\n", foundAt);
                }
            }
        } while (choice != 5);
    }
}
