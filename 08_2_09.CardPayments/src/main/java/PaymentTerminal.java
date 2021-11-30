
public class PaymentTerminal {

	private double money; // amount of cash
	private int affordableMeals; // number of sold affordable meals
	private int heartyMeals; // number of sold hearty meals

	public PaymentTerminal() {
		// register initially has 1000 euros of money
		this.money = 1000;
	}

	public double eatAffordably(double payment) {
		// an affordable meal costs 2.50 euros
		// increase the amount of cash by the price of an affordable meal and return the
		// change
		// if the payment parameter is not large enough, no meal is sold and the method
		// should return the whole payment

		if (2.5 <= payment) {
			money = money + 2.5;
			affordableMeals++;
			return payment - 2.50;
		} else {
			return 0.0;
		}
	}

	public double eatHeartily(double payment) {
		// a hearty meal costs 4.30 euros
		// increase the amount of cash by the price of a hearty mean and return the
		// change
		// if the payment parameter is not large enough, no meal is sold and the method
		// should return the whole payment
		if (4.3 <= payment) {
			money = money + 4.3;
			heartyMeals++;
			return payment - 4.3;
		} else {
			return 0.0;
		}
		
	}
	public boolean eatAffordably(PaymentCard card){

	if (card.balance()>= 2.5) {
		card.takeMoney(2.5);
		money = money -2.5;
		return true;
	}else {
		return false;
	}
		
	}
public boolean eatHeartily(PaymentCard card) {
	
	if (card.balance() >= 4.3){
		card.takeMoney(4.3);
		money = money - 4.3;
		return true;
	}else {
		return false;
	}
}
public void addMoneyToCard(PaymentCard card , double sum ) {
	card.addMoney(sum);
}
	@Override
	public String toString() {
		return "money: " + money + ", number of sold affordable meals: " + affordableMeals
				+ ", number of sold hearty meals: " + heartyMeals;
	}
}
