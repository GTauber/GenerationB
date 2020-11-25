package Exs1;

public class animais {
	public static void main (String[] args) {
		Dog d1=new Dog();
		d1.setName("Stark");
		d1.setAge(10);
		d1.setSound("UAAAAAAH AAAAUUUUUUUH");
		d1.setMovement("Walks and Run");
		Horse h1=new Horse();
		h1.setName("Leo");
		h1.setAge(20);
		h1.setSound("hinn in in hinn in in");
		h1.setMovement("Walks and Run");
		Sloth s1=new Sloth();
		s1.setName("Rose");
		s1.setAge(850);
		s1.setSound("uaaanh uanhh");
		s1.setMovement("Climbs trees and branches.");
		
		Animal[] List=new Animal[3];
		List[0]=d1;
		List[1]=h1;
		List[2]=s1;
		
		for (Animal i:List)
		{
			System.out.println(i.getStats());
		}
	}
}
