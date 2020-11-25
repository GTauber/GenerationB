package Exs1;

public class Sloth extends Animal {

	public Sloth() {
		
	}
	public String getStats() {
		return "Animal name: "+super.getName()+"\nAnimal Age: "+super.getAge()+"\nAnimal sound: "+super.getSound()+"\nAnimal Movement: "
				+super.getMovement();
	}
}
