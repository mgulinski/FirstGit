package concrete_package;

/**
 * @author Machi
 */

public class HourlyEmployee extends Employee {
    
    private double hourlyRate;
    private double hoursWorked;
    
    // constructors 
    
    public HourlyEmployee(String name) {
	super(name);
    }  
    
     public HourlyEmployee(String name, String hireDate) {
	super(name, hireDate);
    }  
    
    public HourlyEmployee(String name, double hourlyRate) {
	super(name);
	this.hourlyRate = hourlyRate;
    }    
   
    public HourlyEmployee(String name, String hireDate, double hourlyRate) {
	super(name, hireDate);
	this.hourlyRate = hourlyRate;
    }  
    
    
    // getters and setters

    public double getHourlyRate() {
	return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
	this.hourlyRate = hourlyRate;
    }
          
    public void setHoursWorked(double hoursWorked){
	this.hoursWorked = hoursWorked;    
    }
    
    public double getHoursWorked() {
	return hoursWorked;
    
    }
    
    
    // calculateWeeklyPay
    public double calculateWeeklyPay() {
	return hourlyRate * hoursWorked; 
    
    }
    // overloading calculateWeeklyPay
    public double calculateWeeklyPay(double hourlyRate, double hoursWorked) {
	return hourlyRate * hoursWorked; 
    }
   
    @Override
    public String toString() {
	
	String str = super.toString() 
		+ "\nHourly Rate:\t" + hourlyRate;
	
	return str;
		 
    }
}
