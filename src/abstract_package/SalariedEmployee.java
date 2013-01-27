package abstract_package;

/**
 * @author Machi
 */
public class SalariedEmployee extends Employee {

    private double salary;
    
    public SalariedEmployee(String name, double salary) {

	super(name);
	this.salary = salary;
    }

    public SalariedEmployee(String name, String empNum, double salary) {

	super(name, empNum);
	this.salary = salary;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }
}
