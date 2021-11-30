
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// you can write test code here
		// however, remove all unnecessary code when doing the final parts of the
		// exercise
		Statistics statistics = new Statistics();	
		Statistics evenstatistics = new Statistics();	
		Statistics oddstatistics = new Statistics();
		System.out.println("Enter numbers :");
		while (true) {
			int a = scanner.nextInt();
			if (a == -1) {
				break;
			}
			if (a % 2 == 0) {
				evenstatistics.addNumber(a);
			}else {
				oddstatistics.addNumber(a);
			}
			statistics.addNumber(a);
			
		}
	
		System.out.println("Count: " + statistics.getCount());
		System.out.println("Sum: " + statistics.sum());
		System.out.println("Average: " + statistics.average());
		System.out.println("Sum of even numbers : "+evenstatistics.sum());
		System.out.println("Sum of odd numbers : "+oddstatistics.sum());
		// In order for the tests to work, the objects must be created in the
		// correct order in the main program. First the object that tracks the total
		// sum, secondly the object that tracks the sum of even numbers,
		// and lastly the one that tracks the sum of odd numbers!
	}
}
