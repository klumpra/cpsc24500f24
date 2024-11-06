import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Ray","Klump","123 Pleasant Lane","815-603-5111");
        Employee employee = new Employee("Karen","Klump",25.25,40.50);
    //    Person person = new Person("Plain","Joe");
        /*
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        customers.add(customer);
        employees.add(employee);
        customers.add(employee);*/
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(customer);
        persons.add(employee);
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
