package Exs1a5;

import java.util.Scanner;

public class Ex5Right {
	public static void main(String args[])
	{
		int a,b=0,c=0,d;
		Scanner in=new Scanner(System.in);
		do 
		{
			System.out.printf("Enter with one integer number: ");
			a=in.nextInt();
			d=a%3;
			if(d==0 && a!=0)
			{
			b=a+b;
			c=c+1;
			}

		}
		while (a!=0);
		b=b/c;
		System.out.printf("Ok, you had digited a total of %d Number(s) and the average of all multiple of 3 is: %d",a,b);
		in.close();
	}
}
