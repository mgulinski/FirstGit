package abstract_package;

import java.text.DecimalFormat;

/**
 * @author Machi
 */
// abstract super class
public abstract class Employee {
    
     DecimalFormat money = new DecimalFormat("$#,##0.00");

    private String name;
    private String empNum;
    private String hireDate;
    private String position;

    // constructors
    public Employee(String name) {
	this.name = name;
    }

    public Employee(String name, String hireDate) {
	this.name = name;
	this.hireDate = hireDate;
    }

    public Employee(String name, String hireDate, String position) {
	this.name = name;
	this.hireDate = hireDate;
    }

    
    // getters and setters
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getEmpNum() {
	return empNum;
    }

    public void setEmpNum(String empNum) {
	this.empNum = empNum;
    }

    public String getHireDate() {
	return hireDate;
    }

    public void setHireDate(String hireDate) {
	this.hireDate = hireDate;
    }

    public String getPosition() {
	return position;
    }

    public void setPosition(String position) {
	this.position = position;
    }
    
    // abstract method with specific implementation in each subclass
    public abstract double calculateWeeklyPay();
    
    // toString method
    @Override
    public String toString() {
	StringBuilder sbr = new StringBuilder();

	sbr.append("\nEmployee name:\t").append(name);
	sbr.append("\nID number:\t").append(empNum);
	sbr.append("\nDate of Hire:\t").append(hireDate);
	sbr.append("\nPosition:\t").append(position);

	String str = "\nEmployee Info\n---------------" + sbr;
	return str;
    }
}