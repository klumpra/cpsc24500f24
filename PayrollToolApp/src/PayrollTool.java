import java.util.ArrayList;
import java.util.Random;
/**
 * Calculate and print the paychecks for a list of employees.
 * This class keeps track of taxes and can assign specified bonuses randomly to employees.
 */
public class PayrollTool {
    private ArrayList<Employee> employees;
    private double taxRate;
    private double bonusPercentage;
    private Random rnd;
    private int bonusFrequency; // 0 to 10 (10 - everyone gets a bonus; 0 - nobody)
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(ArrayList<Employee> emps) {
        employees = emps;
    }
    public double getTaxRate() {
        return taxRate;
    }
    public void setTaxRate(double taxRate) {
        if (taxRate > 1) {
            this.taxRate = 1.0;
        } else if (taxRate < 0) {
            this.taxRate = 0;
        } else {
            this.taxRate = taxRate;
        }
    }
    public double getBonusPercentage() {
        return bonusPercentage;
    }
    public void setBonusPercentage(double bpct) {
        if (bpct > 1) {
            bonusPercentage = 1.0;
        } else if (bpct < 0) {
            bonusPercentage = 0;
        } else {
            bonusPercentage = bpct;
        }
    }
    public int getBonusFrequency() {
        return bonusFrequency;
    }
    public void setBonusFrequency(int bf) {
        if (bf > 10) {
            bonusFrequency = 10;
        } else if (bf < 0) {
            bonusFrequency = 0;
        } else {
            bonusFrequency = bf;
        }
    }
    public PayrollTool() {
        this(new ArrayList<Employee>(),0.1,0.1,5);
    }
    public PayrollTool(ArrayList<Employee> emps, double taxRate, double bonusPercentage, int bonusFrequency) {
        setEmployees(emps);
        setTaxRate(taxRate);
        setBonusPercentage(bonusPercentage);
        setBonusFrequency(bonusFrequency);
        rnd = new Random();
    }
    public void processPayroll() {
        double gross, taxes, bonus, adjGross, net;
        int randomNumber;
        for (Employee emp : employees) {
            gross = emp.getPayRate() * emp.getHoursWorked();
            randomNumber = rnd.nextInt(10);
            if (randomNumber < bonusFrequency) {
                bonus = bonusPercentage * gross;
            } else {
                bonus = 0;
            }
            adjGross = gross + bonus;
            taxes = adjGross * taxRate;
            net = adjGross - taxes;
            System.out.printf("%-15s%-15s%10.2f%10.2f%10.2f%10.2f%10.2f\n",emp.getFirstName(),emp.getLastName(),
                gross,bonus,adjGross,taxes,net);
        }
    }
}
