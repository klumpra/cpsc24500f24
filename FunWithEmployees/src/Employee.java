import java.util.ArrayList;
/**
 * models an employee of the organization
 * It stores the first and last names, hours worked, and hourly rate for an employee
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double hoursWorked;
    private double payRate;
    private ArrayList<String> responsibilities;
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            this.hoursWorked = 0;
        } else {
            this.hoursWorked = hoursWorked;
        }
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        if (payRate < 0) {
            this.payRate = 0;
        } else {
            this.payRate = payRate;
        }
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }   
    /**
     * INitializes employee to FirstName LastName 0 0 
    */ 
    public Employee() {
        this("FirstName","LastName",0,0);  // this calls the non-default constructor
    }
    /**
     * Customizes a new employee based on data passed in
     * @param first
     * @param last
     * @param payRate
     * @param hoursWorked
     */
    public Employee(String first, String last, double payRate, double hoursWorked) {
        setFirstName(first);
        setLastName(last);
        setHoursWorked(hoursWorked);
        setPayRate(payRate);
        responsibilities = new ArrayList<String>();  // composition
    }
    public void addResponsibility(String resp) {
        responsibilities.add(resp);
    }
    public void removeAllResponsibilities() {
        responsibilities.clear();
    }
    public String getResponsibilitiesAsString() {
        String result = "";
        for (String resp : responsibilities) {
            result = result + resp + "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %.2f\n%s",firstName,lastName,hoursWorked,
            payRate,getResponsibilitiesAsString());
    }
}
