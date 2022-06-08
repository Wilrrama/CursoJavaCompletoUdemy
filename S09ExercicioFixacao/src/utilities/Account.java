package utilities;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	
	public static final int TAX = -5;
	
	
	public Account() {		
	}

	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(Integer number,String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
		
	}

	public double getBalance() {
		return balance;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void deposit( double amount) {
		balance = balance + amount;
	}
	
	public void whitdraw( double amount) {
		balance = balance - amount + TAX;
	}
	
	public String toString() {
		return "Account "
				+ number
				+", Holder: "
				+ holder 
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
