package concrete_package;

/**
 * @author Machi
 */
public class SalariedEmployee extends Employee {

    private double monthlySalary;
    
    public SalariedEmployee(String name, double monthlySalary) {

	super(name);
	this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, String empNum, double monthlySalary) {

	super(name, empNum);
	this.monthlySalary = monthlySalary;
    }

    public double getSalary() {
	return monthlySalary;
    }

    public void setSalary(double monthlySalary) {
	this.monthlySalary = monthlySalary;
    }
}
