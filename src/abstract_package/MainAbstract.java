package abstract_package;

import java.text.DecimalFormat;

/**
 * @author Machi
 */
public class MainAbstract {
    
    public static void main(String[] args) {
	
	DecimalFormat pay = new DecimalFormat("#,##0.00");
	
	HourlyEmployee hourlyWorker = new HourlyEmployee("Macio");
	
	hourlyWorker.setPosition("Forklift Operator");
	
	hourlyWorker.setEmpNum("HR-666");
	hourlyWorker.setHourlyRate(16);
	
	System.out.println(hourlyWorker.toString());
	
		
	hourlyWorker.setHoursWorked(40);
	
	System.out.println("\nEmployee name:\t" + hourlyWorker.getName()
			 + "\nPay this week:\t$" + pay.format(hourlyWorker.calculateWeeklyPay()));
	
	
	SalariedEmployee salaryWorker = new SalariedEmployee("Alex Druzny");
	
	salaryWorker.setSalary(50000);
	
	System.out.println(salaryWorker.toString());
	
		
	System.out.println("\nEmployee name:\t" + salaryWorker.getName()
			 + "\nPay this week:\t$" + pay.format(salaryWorker.calculateWeeklyPay()));
	
	
	SalaryPlusBonusEmployee bonusWorker = new SalaryPlusBonusEmployee("Seba", 45000, 200);
	bonusWorker.setPosition("Dancer");
	
	System.out.println(bonusWorker.toString());
    
    
    
    
    }
    
}
