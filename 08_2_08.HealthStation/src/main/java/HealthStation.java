
public class HealthStation {

	private int weighings;

	public int weigh(Person person) {
		// return the weight of the person passed as the parameter		
		weighings++;
		return person.getWeight();
	
	}

	public void feed(Person person) {
		int newWeight = person.getWeight() + 1;
		person.setWeight(newWeight);
	}
	public int weighings() {
		return weighings;	
	}
}
