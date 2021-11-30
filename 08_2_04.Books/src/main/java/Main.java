import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	ArrayList<Book> book = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Title: ");
			String a = scanner.nextLine();
			if (a.isEmpty()) {
				break;
			}
			System.out.println("pages: ");
			int b = Integer.valueOf(scanner.nextLine());
			System.out.println("Publication year: ");
			int c = Integer.valueOf(scanner.nextLine());
			Book books = new Book(a, b, c);
			book.add(books);

		}

		System.out.println("What information will be printed?");
		String d = scanner.nextLine();
		for (Book bookInfo : book) {
			if (d.equals("everything")) {
				System.out.println(bookInfo);
			}else if(d.equals("name")) {
				System.out.println(bookInfo.getTitle());
		}

		}
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
