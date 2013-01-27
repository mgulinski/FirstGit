package concrete_package;

/**
 * @author Machi
 */
public class HourlyEmployee extends Employee {
    
    private double hourlyRate;

    public HourlyEmployee(double hourlyRate, String name, String hireDate) {
	
	super(name, hireDate);
	this.hourlyRate = hourlyRate;
    }    
       
}
