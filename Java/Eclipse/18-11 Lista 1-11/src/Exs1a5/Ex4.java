package Exs1a5;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[])
	{
		int a,b=0,c=0;
		Scanner in=new Scanner(System.in);
		do 
		{
			System.out.printf("Enter with one keyboard number: ");
			a=in.nextInt();
			if(a>=0 && a<10)
			{
			b=a+b;
			c=c+1;
			}
			else
			{
				System.out.printf("Please, type just keyboard numbers.\n");
			}
		}
		while (a!=0);
		System.out.printf("Ok, you had digited a total of %d Number(s) and the sum of all digited numbers are: %d",c,b);
		in.close();
	}
}
