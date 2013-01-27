
package concrete_package;

/**
 * @author Machi
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    
    private double monthlyBonus;
    
    public SalaryPlusBonusEmployee(String name, double salary, double monthlyBonus) {
	
	super(name, salary);
	this.monthlyBonus = monthlyBonus;    
    
    
    }

    public double getMonthlyBonus() {
	return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
	this.monthlyBonus = monthlyBonus;
    }
    
    
    
}
