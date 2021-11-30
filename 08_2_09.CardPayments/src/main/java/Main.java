
public class Main {

	public static void main(String[] args) {
		// write experimental main programs here
		PaymentCard card = new PaymentCard(10);
		System.out.println("money " + card.balance());
		System.out.println("successfully took: " + card.takeMoney(8));
		System.out.println("money " + card.balance());
		System.out.println("successfully took: " + card.takeMoney(8));
		PaymentTerminal unicafeExactum = new PaymentTerminal();
		double change = unicafeExactum.eatAffordably(10);
		System.out.println("remaining change " + change);
		change = unicafeExactum.eatAffordably(5);
		System.out.println("remaining change " + change);
		change = unicafeExactum.eatHeartily(4.3);
		System.out.println("remaining change " + change);
		System.out.println(unicafeExactum);
		PaymentCard annesCard = new PaymentCard(2);
		boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
		System.out.println("amount of money on the card is "+annesCard.balance()+" euros");
		unicafeExactum.eatHeartily(annesCard);
		System.out.println("there was enough money: " + wasSuccessful);
		unicafeExactum.addMoneyToCard(annesCard, 100);
		System.out.println("amount of money on the card is "+annesCard.balance()+" euros");
		System.out.println("there was enough money: " + wasSuccessful);
		wasSuccessful = unicafeExactum.eatHeartily(annesCard);
		System.out.println("there was enough money: " + wasSuccessful);
		wasSuccessful = unicafeExactum.eatAffordably(annesCard);
		System.out.println("there was enough money: " + wasSuccessful);
		System.out.println(unicafeExactum);

	}
}
