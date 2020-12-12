class PoorDog {
	// declare two instance variables, but don't assign a value
	private int size;
	private String name;

	// What will these return??
	public int getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
}

public class PoorDogTestDrive {
	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		// What do you think? Will this even compile?
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog name is " + one.getName());
	}
}