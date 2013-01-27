package interface_package;

/**
 * @author Machi
 */
public interface Employee {
    
//    public Employee(String name, String hireDate) {
//	this.name = name;
//	this.hireDate = hireDate;
//    }

    public abstract String getName();
    
    public void setName(String name);

    public String getEmpNum();

    public void setEmpNum(String empNum);

    public String getHireDate();

    public void setHireDate(String hireDate);
    
    
    
}
