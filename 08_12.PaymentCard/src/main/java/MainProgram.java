
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        System.out.println("Paul : "+ paulsCard);
        mattsCard.eatAffordably();
        System.out.println("Matt : " + mattsCard);
        paulsCard.addMoney(20);
        System.out.println("Paul : " + paulsCard);
        mattsCard.eatHeartily();
        System.out.println("Matt : " + mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul : " + paulsCard);
        System.out.println("Matt : " + mattsCard);
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}