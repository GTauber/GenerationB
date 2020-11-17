package Exs1a3;

/*
	As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
	Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.
*/
import java.util.*;

public class Ex3 {
	public static void main(String args[])
	{
		double a;
		Scanner in=new Scanner(System.in);
		System.out.println("Hello. How many apples you'll take?");
		a=in.nextDouble();
		if (a>=12)
		{
			a=a*0.25;
			System.out.printf("The price is "+a);
		}
		else
		{
			a=a*0.30;
			System.out.printf("The price is "+a);
		}
		in.close();
	}

}
