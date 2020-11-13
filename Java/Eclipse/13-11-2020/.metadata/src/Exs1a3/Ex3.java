package Exs1a3;

import java.util.Scanner;

public class Ex3 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		double A,B,C,D;
		Scanner in=new Scanner(System.in);
		System.out.printf("Hello, here you have a D calculator, so knows D = ((A+B^2)+(B+C^2))/2\nEnter with A: ");
		A=in.nextDouble();
		System.out.printf("Now B: ");
		B=in.nextDouble();
		System.out.printf("Now C: ");
		C=in.nextDouble();
		D =Math.pow((A+B), 2);
		D =(D+Math.pow((B+C), 2))/2;
		System.out.printf("Perfect, D is equal to: "+D);

	}

}
