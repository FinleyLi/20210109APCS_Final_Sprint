public class Player {
	/** the number this player guessed */
	int number = 0; // where the games goes

	/** method for making a guess */
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}