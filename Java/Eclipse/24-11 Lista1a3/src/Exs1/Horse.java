package Exs1;

public class Horse extends Animal {

	public Horse() {
	}
	public String getStats() {
		return "Animal name: "+super.getName()+"\nAnimal Age: "+super.getAge()+"\nAnimal sound: "+super.getSound()+"\nAnimal Movement: "
				+super.getMovement();
	}
}