/* This plays the role of the Controller (where the model and view come together).
Very common in small apps for the main class to be the controller.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify the name of the file: ");
        String fname = sc.nextLine();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Ray","Klump",54.2,25.75);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        //EmployeeView view = new EmployeeView();
        EmployeeView.writeToScreen(employees);
        if (EmployeeView.writeToFile(employees,fname)) {
            System.out.println("The employees were written to a file.");
        } else {
            System.out.println("The employees could not be written.");
        }
    }
}
