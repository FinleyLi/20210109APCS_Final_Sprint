/**
The guessing game involves a 'game' object and three 'player' objects. The game gen-
erates a random number between 0 ad 9, and the three palyer objects try to guess
it.(We didn't say it ws a really exciting game.)
*/
import java.util.*;
//Compiler version JDK
/*
public class GuessGame{
	/** instance variables for the three palyers 
	// GuessGame as three instance variables for the three Player object
	Player p1;
	Player p2;
	Player p3;

	public void startGame(){
		// Create three Player objects and assign them to the three Player instance variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		// declare three variables to hold the three gusses the Players make
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		// declare three varables to hold a true or false based on the player's answer
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		// make a 'target' number that the players have to guess
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");

		while(true) {
			System.out.println("Number to guess is " + targetNumber);

			// call cach player's guess() method
			p1.guess();
			p2.guess();
			p3.guess();

			// get each player's guess (the result of their guess() method running) by accessing the number variable of each player
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);

			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);

			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);

			// check each palyer's guess to see if it matches the target number.
			// If a player is rights, then set that player's variable to be true 
			// (remember, we set ir false by default)
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}

			// if player one OR player two OR player three is right...
			// (the || operator means OR)
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break; // game over, so break out of the loop
			// otherwise, stay in the loop and ask the players for another guess.
			} else {
				// we must keep going because nobody got it right!
				System.out.println("Players will have to try angin.");
			} // end if/else
		} // end loop
	} // end method
} // end class


public class Player {
	/** the number this player guessed 
	int number = 0; // where the games goes

	/** method for making a guess 
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
*/
public class GameLauncher {
	/** makes a GuessGame object and tells it to startGame */
	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
	}
}

/**
 Output
I'm thinking of a number between 0 and 9...
Number to guess is 5
I'm guessing 2
I'm guessing 0
I'm guessing 7
Player one guessed 2
Player two guessed 0
Player three guessed 7
Players will have to try angin.
Number to guess is 5
I'm guessing 7
I'm guessing 0
I'm guessing 4
Player one guessed 7
Player two guessed 0
Player three guessed 4
Players will have to try angin.
Number to guess is 5
I'm guessing 5
I'm guessing 6
I'm guessing 4
Player one guessed 5
Player two guessed 6
Player three guessed 4
We have a winner!
Player one got it right? true
Player two got it right? false
Player three got it right? false
Game is over.


Process Finished.
>>>
*/