import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
/*        Customer customer = new Customer("Ray","Klump","123 Pleasant Lane","815-603-5111");
        Employee employee = new Employee("Karen","Klump",25.25,40.50);
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(customer);
        persons.add(employee);
        for (Person p : persons) {
            System.out.println(p);
        }
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("First we will create a customer. Please enter their first name and lastname: ");
        String first, last, address, phone;
        first = sc.next();
        last = sc.next();
        System.out.print("Enter their address: ");
        sc.nextLine();  // get rid of EOL marker
        address = sc.nextLine();
        System.out.print("Enter their phone number: ");
        phone = sc.next();
        Customer c = new Customer(first,last,address,phone);
        System.out.println("NOw I will create an employee with hard-coded values.");
        Employee e = new Employee("Joe","Schmoe",67.50,12.0);
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(c);
        persons.add(e);
        printPeople(persons);
    }
    public static void printPeople(ArrayList<Person> peeps) {
        for (Person peep : peeps) {
            System.out.println(peep);
        }
    }
}
