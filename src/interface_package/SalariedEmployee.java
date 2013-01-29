package interface_package;

import java.text.DecimalFormat;

/**
 * @author Machi
 */
public class SalariedEmployee implements Employee {
    
    DecimalFormat money = new DecimalFormat("$#,##0.00");
    
    private String name;
    private String empNum;
    private String hireDate;
    private String position;
      
    private double annualSalary;

    // constructors
    public SalariedEmployee(String name) {
	this.name = name;
    }

    public SalariedEmployee(String name, double annualSalary) {

	this.name = name;
	this.annualSalary = annualSalary;
    }

    public SalariedEmployee(String name, String hireDate, double annualSalary) {

	this.name = name;
	this.hireDate = hireDate;
	this.annualSalary = annualSalary;
    }

   //  getters and setters (overriding abstract methods)   
    
    @Override
    public String getName() {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setName(String name) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getEmpNum() {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setEmpNum(String empNum) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getHireDate() {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setHireDate(String hireDate) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getPosition() {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPosition(String position) {
	throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // getter and setter for specific local variable
     public double getAnnualSalary() {
	return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
	this.annualSalary = annualSalary;
    }
    
    
    // calculateWeeklyPay methods
    @Override
    public double calculateWeeklyPay() {
	return annualSalary / 52.0; //annual salary divided by 52 weeks in a year
    }
    // overloading above method
    public double calculateWeeklyPay(double annualSalary) {
	return annualSalary / 52.0;
    }
    
    
    @Override
    public String toString() {
	
	StringBuilder sbr = new StringBuilder("\nEmployee Info\n---------------");

	sbr.append("\nEmployee name:\t").append(name);
	sbr.append("\nID number:\t").append(empNum);
	sbr.append("\nDate of Hire:\t").append(hireDate);
	sbr.append("\nPosition:\t").append(position);
	
	String str = sbr + "\nAnnual Salary:\t" + money.format(annualSalary);
	return str;
		 
    }
}
