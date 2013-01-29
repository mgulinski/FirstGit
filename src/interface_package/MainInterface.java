package interface_package;

import java.text.DecimalFormat;

/**
 * @author Machi
 */
public class MainInterface {
    
    public static void main(String[] args) {
	
	DecimalFormat pay = new DecimalFormat("#,##0.00");
	
	abstract_package.HourlyEmployee hourlyWorker = new abstract_package.HourlyEmployee("Mattias");
	
	hourlyWorker.setPosition("Driver");
	
	hourlyWorker.setEmpNum("DR-101");
	hourlyWorker.setHourlyRate(20);
	
	System.out.println(hourlyWorker.toString());
	
		
	hourlyWorker.setHoursWorked(45);
	
	System.out.println("\nEmployee name:\t" + hourlyWorker.getName()
			 + "\nPay this week:\t$" + pay.format(hourlyWorker.calculateWeeklyPay()));
	
	
	abstract_package.SalariedEmployee salaryWorker = new abstract_package.SalariedEmployee("Alexandra");
	
	salaryWorker.setSalary(80000);
	
	System.out.println(salaryWorker.toString());
	
		
	System.out.println("\nEmployee name:\t" + salaryWorker.getName()
			 + "\nPay this week:\t$" + pay.format(salaryWorker.calculateWeeklyPay()));
	
	
	abstract_package.SalaryPlusBonusEmployee bonusWorker = new abstract_package.SalaryPlusBonusEmployee("Seba", 45000, 200);
	bonusWorker.setPosition("Bouncer");
	
	System.out.println(bonusWorker.toString());
    
    }
    
}
