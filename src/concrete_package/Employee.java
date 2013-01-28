package concrete_package;

/**
 * @author Machi
 */
// super class
public class Employee {
    
    private String name;
    private String empNum;
    private String hireDate;
    private String position;

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
    
     public String toString() {
	
	String str = "\nEmployee name:\t" + name
		+ "\nID number:\t" + empNum
		+ "\nDate of Hire:\t" + hireDate
		+ "\nPosition:\t" + position;
	
	return str;
}
}