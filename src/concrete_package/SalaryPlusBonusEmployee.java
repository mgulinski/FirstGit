
package concrete_package;

    
/**
 * @author Machi
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    
    private double weeklyBonus;
    
    public SalaryPlusBonusEmployee(String name) {
	super(name);
    }
    
    public SalaryPlusBonusEmployee(String name, double weeklyBonus) {
	
	super(name);
	this.weeklyBonus = weeklyBonus;    
        }
    
    public SalaryPlusBonusEmployee(String name, double annualSalary, double weeklyBonus) {
	
	super(name, annualSalary);
	this.weeklyBonus = weeklyBonus;       
    }

    public double getWeeklyBonus() {
	return weeklyBonus;
    }

    public void setWeeklyBonus(double weeklyBonus) {
	this.weeklyBonus = weeklyBonus;
    }

   
    @Override
    public double calculateWeeklyPay() {
	
	return super.getSalary()/ 52 + weeklyBonus;
    
    }
    
    @Override
    public String toString() {
	
	String str = super.toString() 
		+ "\nWeekly Bonus:\t" + money.format(weeklyBonus);
	
	return str;
    
    
    
    }
    
}
