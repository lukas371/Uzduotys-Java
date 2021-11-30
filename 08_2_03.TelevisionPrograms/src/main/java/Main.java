import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// implement here your program that uses the TelevisionProgram class

		ArrayList<TelevisionProgram> programs = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Name: ");
			String a = scanner.nextLine();
			if (a.isEmpty()) {
				break;
			}
			System.out.println("Duration: ");
			int b = Integer.valueOf(scanner.nextLine());
			TelevisionProgram program = new TelevisionProgram(a, b);
			programs.add(program);

		}

		System.out.println("Programs maximum duration?");
		int c = scanner.nextInt();
		for (TelevisionProgram televisionProgram : programs) {
			if (televisionProgram.getDuration() <= c) {
				System.out.println(televisionProgram);
			}

		}

	}
}
