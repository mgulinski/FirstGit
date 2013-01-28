package concrete_package;

/**
 * @author Machi
 */
public class MainConcrete {
    
    public static void main(String[] args) {
	
	HourlyEmployee hourlyWorker = new HourlyEmployee("Macio", "2.01.2013");
	
	hourlyWorker.setPosition("General");
	
	System.out.println(hourlyWorker.toString());
	
	hourlyWorker.setEmpNum("HR-0187");
	
	System.out.println(hourlyWorker.toString());
	
	hourlyWorker.setHourlyRate(15);
	
	hourlyWorker.setHoursWorked(45);
	
	System.out.println("\nEmployee name:\t" + hourlyWorker.getName()
			 + "\nPay this week:\t$" + hourlyWorker.calculateWeeklyPay());
	
	
	SalariedEmployee salaryWorker = new SalariedEmployee("Alex");
	
	salaryWorker.setSalary(50000);
	
	System.out.println(salaryWorker.toString());
	
		
	System.out.println("\nEmployee name:\t" + salaryWorker.getName()
			 + "\nPay this week:\t$" + salaryWorker.calculateWeeklyPay());
	
	
	SalaryPlusBonusEmployee bonusWorker = new SalaryPlusBonusEmployee("Seba", 45000, 200);
	bonusWorker.setPosition("Trickster");
	
	System.out.println(bonusWorker.toString());
    }
    
}
