package interface_package;

/**
 * @author Machi
 */
public interface Employee {

// gettters and setters
    public String getName();
    void setName(String name);

    String getEmpNum();
    void setEmpNum(String empNum);

    String getHireDate();
    void setHireDate(String hireDate);
    
    String getPosition();
    void setPosition(String position);
    
// calculate weekly pay method
    double calculateWeeklyPay();
       
}
