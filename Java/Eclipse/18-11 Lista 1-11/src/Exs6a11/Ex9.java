package Exs6a11;

import java.util.Scanner;

public class Ex9 {
	public static void main(String args[])
	{
		int a;
		Scanner in=new Scanner(System.in);
		System.out.printf("Type the number you wanna multiply by 3 until 100: ");
		a=in.nextInt();
		System.out.println(a);
		while (a<=100)
		{
			a=a*3;
			System.out.println(a);
		}
		in.close();
	}


}
