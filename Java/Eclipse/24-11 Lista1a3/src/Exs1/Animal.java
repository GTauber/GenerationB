package Exs1;

public class Animal {
	private String name,sound,movement,Stats;
	private int age;
	public Animal(String name, Integer age, String sound, String movement) {
		super();
		this.name = name;
		this.age = age;
		this.sound = sound;
		this.movement = movement;
	}
	public Animal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}
	public String getStats() {
		return Stats;
	}
	public void setStats(String stats) {
		Stats = stats;
	}
	
	
}
