package entities;

public class Legal extends Person{

	private Integer employeeNumber;
	
	public Legal() {
		super();
	}
			
	public Legal(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}
		
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public Double tax() {
		if (employeeNumber > 10) {
			return annualIncome*0.14;
		}
		return annualIncome*0.16;
	}

}
