
public class Counter {
	private int counter;
	private int value;

	public Counter(int startValue) {
		this.value = startValue;
	}

	public Counter() {
		counter = 0;
	}

	public int value() {
		return value;
	}

	public void increase() {

		value++;

	}

	public void decrease() {

		value--;
	}

	public void increase(int increaseBy) {

		if (increaseBy >= 0) {
			value = value + increaseBy;
		}

	}

	public void decrease(int decreaseBy) {

		if (decreaseBy >= 0) {
			value = value - decreaseBy;
		}

	}

	public int getValue() {
		return value;
	}

	public int gerCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return value + "";
	}

}
