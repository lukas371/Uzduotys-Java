
public class PaymentCard {
	private double balance;

	public PaymentCard(double openingBalance) {
		this.balance = openingBalance;
	}

	public String toString() {
		return "The card has a balance of " + balance + " euros";
	}

	public void eatAffordably() {

		if (balance >= 2.6) {
			balance = balance - 2.6;
		}

	}

	public void eatHeartily() {
		if (balance >= 4.6) {
			balance = balance - 4.6;
		}
	}

	public void addMoney(double amount) {
if (amount <= 0) {
			return;
		}
		
		if (balance + amount < 150) {
			balance = balance + amount;
		} else if (balance + amount  >= 150) {
			balance = 150;
		}
		
	}
}
