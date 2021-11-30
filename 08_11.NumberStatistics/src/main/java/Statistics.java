public class Statistics {
	private int count;
	private int sum;

	public void addNumber(int number) {
		count++;
		sum = sum + number;		
	}

	public int getCount() {
		return count;
	}

	public int sum() {
		return sum;
	}

	public double average() {
		if (count == 0) {
			return 0;
		}
		return (double) sum / count;
	}
		
}
