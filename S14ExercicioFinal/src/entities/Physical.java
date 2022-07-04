package entities;

public class Physical extends Person {

	private Double healthExpenses;
	
	public Physical() {
		super();
	}
			
	public Physical(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
		

	@Override
	public Double tax() {
		if (annualIncome < 20000.00) {
			return (annualIncome * 0.15) - (healthExpenses*0.50);
		} else {
			return (annualIncome * 0.25) - (healthExpenses*0.50);
		}		
		
	}

}
