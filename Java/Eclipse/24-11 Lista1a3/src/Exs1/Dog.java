package Exs1;

public class Dog extends Animal {

	public Dog() {
		
	}

	public String getStats() {
		return "Animal name: "+super.getName()+"\nAnimal Age: "+super.getAge()+"\nAnimal sound: "+super.getSound()+"\nAnimal Movement: "
				+super.getMovement();
	}
}
