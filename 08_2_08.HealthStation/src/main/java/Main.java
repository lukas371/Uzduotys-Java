
public class Main {

	public static void main(String[] args) {
		// write experimental code here to check how your program functions
		HealthStation childrenHospital = new HealthStation();
		Person ethan = new Person("Ethan", 1, 110, 7);
		Person peter = new Person("Peter", 33, 176, 85);
		System.out.println(ethan.getName() + "weight: " + childrenHospital.weigh(ethan) + " kilos");
		System.out.println(peter.getName() + "weight: " + childrenHospital.weigh(peter) + " kilos");
		childrenHospital.feed(ethan);
		childrenHospital.feed(ethan);
		childrenHospital.feed(ethan);
		System.out.println("");
		System.out.println(ethan.getName() + "weight: " + childrenHospital.weigh(ethan) + " kilos");
		System.out.println(peter.getName() + "weight: " + childrenHospital.weigh(peter) + " kilos");
		System.out.println("weighings performed: " + childrenHospital.weighings());
		childrenHospital.weigh(peter);
		childrenHospital.weigh(ethan);
		System.out.println("weighings performed: " + childrenHospital.weighings());
	}
}
