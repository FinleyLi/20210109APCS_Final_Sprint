/*
	@ compiler version JDK 11.0.9.1
	@ Input: Null
	@ Output: Override annotation
	@ Date: 2020/12/02
	@ Author: Finley
*/
// Interface, Abstract Type


// override animal's run()
// Hybriddog extends Dog, override Dog's run().
class Animal{
	public void move(){
		System.out.println("Animal can move");
	}
}

class Dog extends Animal{
	@Override
	public void move(){
		System.out.println("Dog can move");
	}
}

// Polymorphism
public class Mix{
	public static void main(String[] args){
		Animal cat = new Animal();
		Animal mix = new Dog();

		cat.move();
		mix.move();
	}
}