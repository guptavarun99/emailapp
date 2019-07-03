package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email("Varun", "Gupta", 13);
		em1.setalternateemail("varungupta45@sales.amazon.com");
		System.out.println(em1.getalternateemail());
	}

}
