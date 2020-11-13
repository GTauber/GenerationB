package Exs1a3;

import java.util.Scanner;

public class Ex1 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int a,b,c,av;
		Scanner in = new Scanner(System.in);
		System.out.println("To calculate your average please insert your grades: ");
		a=in.nextInt();
		a=a*2;
		System.out.println("Next grade: ");
		b=in.nextInt();
		b=b*3;
		System.out.println("Another one: ");
		c=in.nextInt();
		c=c*5;
		av=(a+b+c)/10;
		System.out.printf("Your average was: "+av);
		
		
	}

}
