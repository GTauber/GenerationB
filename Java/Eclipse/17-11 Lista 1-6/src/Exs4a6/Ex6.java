package Exs4a6;

import java.util.*;

public class Ex6 {
	public static void main(String args[])
	{
		double a,b,c,d=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		a=in.nextDouble();
		if (a>d)
		{
			d=a;
		}
		System.out.println("Enter the value of B: ");
		b=in.nextDouble();
		if (b>d)
		{
			d=b;
		}
		System.out.println("Enter the value of C: ");
		c=in.nextDouble();
		if (c>d)
		{
			d=c;
		}
		System.out.printf("Ok, the values inserted respectively is %.2f; %.2f; %.2f; and the greater one is %.2f",a,b,c,d);
		in.close();
	}

}
