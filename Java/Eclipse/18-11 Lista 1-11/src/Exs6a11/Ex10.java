package Exs6a11;

import java.util.Scanner;

public class Ex10 {
	public static void main(String args[])
	{
		int a=233;
		Scanner in=new Scanner(System.in);
		do 
		{
			System.out.println(a);
			
			if(a>=300 && a<=400)
			{
			a=a+3;
			}
			else {
				a=a+5;
			}

		}
		while (a<=456);
		System.out.println(a);
		in.close();

	}
}
