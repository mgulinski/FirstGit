package concrete_package;

/**
 * @author Machi
 */
public class SalariedEmployee extends Employee {

    private double annualSalary;

    public SalariedEmployee(String name) {
	super(name);
    }

    public SalariedEmployee(String name, double annualSalary) {

	super(name);
	this.annualSalary = annualSalary;
    }

    public SalariedEmployee(String name, String hireDate, double annualSalary) {

	super(name, hireDate);
	this.annualSalary = annualSalary;
    }

    public double getSalary() {
	return annualSalary;
    }

    public void setSalary(double annualSalary) {
	this.annualSalary = annualSalary;
    }
    
    public double calculateWeeklyPay() {
	return annualSalary / 52.0; //annual salary divided by 52 weeks in a year
    }
    
    public String toString() {
	
	String str = super.toString() 
		+ "\nAnnual Salary:\t" + annualSalary;
	return str;
		 
    }
}
