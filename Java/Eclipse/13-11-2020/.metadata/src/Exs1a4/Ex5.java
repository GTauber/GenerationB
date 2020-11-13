package Exs1a4;

import java.util.Scanner;

public class Ex5 {
	public static void main(String args[])
	{
		int age,m,d,dt;
		Scanner in=new Scanner(System.in);
		System.out.printf("How old are you? ");
		age=in.nextInt();
		in.nextLine();
		System.out.printf("How many months passed since your last anniversary? ");
		m=in.nextInt();
		System.out.printf("Whats the date today? ");
		d=in.nextInt();
		dt=d+(age*365)+(m*30);
		System.out.printf("You have lived "+dt+" Days until now.");
		
		
	}
}
