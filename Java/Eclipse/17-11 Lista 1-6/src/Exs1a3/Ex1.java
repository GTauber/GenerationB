package Exs1a3;
//	Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.
import java.util.*;

public class Ex1 {
	public static void main(String args[])
	{
		double a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Value of A: ");
		a=in.nextDouble();
		in.nextLine();
		System.out.println("Value of B: ");
		b=in.nextDouble();
		if (a>b)
		{
			System.out.printf("A: "+a+" is greater than B: "+b);
		}
		else
		{
			System.out.println("B: "+b+" is greater than A: "+a);
		}
		in.close();
	}

}
