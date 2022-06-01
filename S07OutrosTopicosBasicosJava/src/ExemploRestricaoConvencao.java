
public class ExemploRestricaoConvencao {

	private String holder;
	private Double balance;

	public ExemploRestricaoConvencao(String holder, Double balance) {
		this.holder = holder;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
}