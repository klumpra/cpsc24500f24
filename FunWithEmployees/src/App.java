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
        emp2.addResponsibility("Take out the garbage.");
        emp2.addResponsibility("Wash the tables after Junior spills apple sauce.");
        System.out.println("I've created two employees. Now you specify the third: ");
        System.out.print("Enter first and last name: ");
        String first, last;
        first = sc.next();
        last = sc.next();
        System.out.print("Enter hours worked and pay rate: ");
        double hours, rate;
        hours = sc.nextDouble();
        rate = sc.nextDouble();
        sc.nextLine(); // get rid of end-of-line marker
        Employee emp3 = new Employee(first, last, rate, hours);
        String resp;
        String yorn;
        do {
            System.out.print("What responsibility do you want to add? ");
            resp = sc.nextLine();
            emp3.addResponsibility(resp);
            System.out.print("Any others? ");
            yorn = sc.nextLine();
        } while (yorn.equals("y"));
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        //EmployeeView view = new EmployeeView();
        EmployeeView.writeToScreen(employees);
        if (EmployeeView.writeToFile(employees,fname)) {
            System.out.println("The employees were written to a file.");
        } else {
            System.out.println("The employees could not be written.");
        }
        /*
        System.out.println("Now read those employees back ...");
        EmployeeReader reader = new EmployeeReader();
        ArrayList<Employee> readFromFile = reader.readEmployeesFromSpaceDelimitedTextFile(fname);
        if (readFromFile == null) {
            System.out.println("The file could not be read.");
        } else {
            EmployeeView.writeToScreen(readFromFile);
        }
        */
    }
}
