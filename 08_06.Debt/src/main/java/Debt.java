
public class Debt {
	private double balance;
	private double interestRaste;
	public Debt(double initialBalace, double initialInterestRate) {
		this.balance = initialBalace;
		this.interestRaste = initialInterestRate;
	}
	public void printBalance() {
		System.out.println(balance);
	}
	public void waitOneYear() {
		balance = balance*interestRaste;
	}
}
