package Exs6a11;

import java.util.Scanner;

public class Ex11 {
	public static void main(String args[])
	{
		int a,b=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter with a number to dicovery the sum of all numbers until it");
		a=in.nextInt();
		do 
		{
			b=a+b;
			a--;
		}
		while (a>0);
		System.out.println(b);
		in.close();

	}
}
