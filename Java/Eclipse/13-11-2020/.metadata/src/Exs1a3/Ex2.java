package Exs1a3;

import java.util.Scanner;

public class Ex2 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		double fprice,cprice;
		Scanner in = new Scanner(System.in);
		System.out.printf("Hello Dealership, tell me the factory price of the car please: ");
		fprice=in.nextDouble();
		in.nextLine();
		cprice=(fprice*173)/100;
		System.out.printf("Alright, the consumer price is: "+cprice);
	}

}
