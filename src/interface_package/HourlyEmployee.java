package interface_package;

/**
 * @author Machi
 */
import java.text.DecimalFormat;

public class HourlyEmployee implements Employee {
    
    DecimalFormat money = new DecimalFormat("$#,##0.00");
    
    private String name;
    private String empNum;
    private String hireDate;
    private String position;
    
    private double hourlyRate;
    private double hoursWorked;
    
    // constructors 
    
    public HourlyEmployee(String name) {
	this.name = name;
	   }  
    
     public HourlyEmployee(String name, String hireDate) {
	this.name = name;
	this.hireDate = hireDate;
     }
         	   
    public HourlyEmployee(String name, String empNum, String hireDate) {
	
	this.name = name;
	this.empNum = empNum;
	this.hireDate = hireDate;
    }  
    
    
    // getters and setters

    @Override
    public String getName() {
	return name;
    }

    @Override
    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String getEmpNum() {
	return empNum;
    }

    @Override
    public void setEmpNum(String empNum) {
	this.empNum = empNum;
    }

    @Override
    public String getHireDate() {
	return hireDate;
    }

    @Override
    public void setHireDate(String hireDate) {
	this.hireDate = hireDate;
    }

    @Override
    public String getPosition() {
	return position;
    }

    @Override
    public void setPosition(String position) {
	this.position = position;
    }

    
    
    
    public double getHourlyRate() {
	return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
	this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
	return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
	this.hoursWorked = hoursWorked;
    }

    
    // calculateWeeklyPay
    @Override
    public double calculateWeeklyPay() {
	return hourlyRate * hoursWorked; 
    
    }
    // overloading calculateWeeklyPay
    public double calculateWeeklyPay(double hourlyRate, double hoursWorked) {
	return hourlyRate * hoursWorked; 
    }
   
    @Override
    public String toString() {
	
	StringBuilder sbr = new StringBuilder("\nEmployee Info\n---------------");

	sbr.append("\nEmployee name:\t").append(name);
	sbr.append("\nID number:\t").append(empNum);
	sbr.append("\nDate of Hire:\t").append(hireDate);
	sbr.append("\nPosition:\t").append(position);
	
	String str = sbr + "\nHourly Rate:\t" + money.format(hourlyRate);
	
	return str;
		 
    }
}
