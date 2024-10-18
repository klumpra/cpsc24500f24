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
        System.out.println("4. Find a friend");
        System.out.println("5. Edit a friend");
        System.out.println("6. Clear our list of friends");
        System.out.println("7. Exit");
        System.out.print("Enter the number of your choice: ");
    }
    public static void printFriends(ArrayList<String> friends, ArrayList<String> phones) {
    /*     for (String friend : friends) {
            System.out.println(friend);
        }
    */
        for (int i = 0; i < friends.size(); i++) {
            System.out.printf("%d. %s - %s\n",(i+1),friends.get(i),phones.get(i));
        }
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
        ArrayList<String> phones = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String friendName, phone;
        int foundAt, editNum;
        do {
            printMenu();
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter the name of the friend to add: ");
                sc.nextLine();
                friendName = sc.nextLine();
                System.out.print("Enter their phone number: ");
                phone = sc.nextLine();
                friends.add(friendName);
                phones.add(phone);
            } else if (choice == 2) {
                System.out.print("Enter the name of the person whose politics you disagee with: ");
                sc.nextLine();
                friendName = sc.nextLine();
                foundAt = findFriend(friends,friendName);
                if (foundAt >= 0) {
                    friends.remove(foundAt);
                    phones.remove(foundAt);
                } else {
                    System.out.println("That friend was not found.");
                }
            } else if (choice == 3) {
                printFriends(friends,phones);
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
            } else if (choice == 5) {
                printFriends(friends,phones);
                System.out.print("Enter the number of the friend to edit: ");
                editNum = sc.nextInt();
                while (editNum > friends.size() || editNum <= 0) {
                    System.out.println("There is no such friend. Try again.");
                    System.out.print("Enter the number of the friend to edit: ");
                    editNum = sc.nextInt();
                }
                System.out.print("Enter the new name for that friend: ");
                sc.nextLine();
                friendName = sc.nextLine();
                friends.set(editNum-1,friendName);  // the -1 is to correct between humans entering starting at 1 and computers starting storing at 0
            } else if (choice == 6) {
                friends.clear();
                System.out.println("You are now free to make new friends.");
            } else if (choice != 7) {
                System.out.println("That is an invalid choice.");
            }
        } while (choice != 7);
    }
}
