import java.util.LinkedHashMap;
public class App {
    public static void printFriends(LinkedHashMap<String,String> friends) {
        for (String name : friends.keySet()) {
            System.out.printf("%s - %s\n", name, friends.get(name));
        }
    }
    public static void main(String[] args) throws Exception {
        LinkedHashMap<String,String> friends = new LinkedHashMap<String,String>();
        friends.put("Ray","815-836-5528");
        friends.put("Karen","312-123-4567");
        friends.put("Conor","123-456-7890");
        printFriends(friends);
        String findName = "Conor";
        if (friends.containsKey(findName)) {
            System.out.println("Phone Number = " + friends.get(findName));
        } else {
            System.out.println("Not found)");
        }
        friends.remove("Conor");
        printFriends(friends);
    }
}
