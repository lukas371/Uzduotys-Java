
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

	public static void main(String[] args) {
		// implement here your program that uses the class Item

		ArrayList<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Name: ");
			String a =scanner.nextLine();
			if (a.isEmpty()) {
				break;
			}
			Item item = new Item(a);
			items.add(item);

		}

		for (Item el : items) {
			System.out.println(el);
		}

	}
}
