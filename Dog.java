/**
Class for defining a dog in a virtual pet simulator.
*/
public class Dog extends Pet {
	/**
	Constructor for Dog. Uses the Super constructor from Pet to set
	the name of the Dog
	@param name the name of the dog
	*/
    public Dog(String name) {
        super(name);
    }

	/**
	Prints the name of the dog followed by "says: Woof!"
	*/

	public void fetch() {
		system.out.println (getName() +" Says: Woof! ");
	}

    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }

	public void wags() {
        System.out.println(getName() + " Wags their tail!");
    }

	public void rolls() {
        System.out.println(getName() + " Rolls over!");
    }
}
