package services;

public class BrasilInterestService implements InterestService {

	private double interestRate;

	public BrasilInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
	}
