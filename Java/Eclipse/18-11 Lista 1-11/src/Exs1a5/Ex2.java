package Exs1a5;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) 
	{
		double a,c;
		Scanner in=new Scanner(System.in);
		System.out.printf("Insert 10 values (Can be decimal too), i will tell for you wich is evens and wich is odd. Let's go\n");
		for (c=1;c<11;c++)
		{
			System.out.printf("\n%.0f:",c);
			a=in.nextDouble();
			a=a%2;
			if (a==0)
			{
				System.out.printf("This number is Even!");
			}
			else
			{
				System.out.printf("This number is Odd!");
			}
			in.close();
		}
	}

}
