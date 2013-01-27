package abstract_package;

/**
 * @author Machi
 */
public abstract class Employee {
    
    private String name;
    private String empNum;
    private String hireDate;

    public Employee() {
    }
    
     public Employee(String name) {
	this.name = name;
     
     }    
    
    public Employee(String name, String hireDate) {
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
    
    
    
}
