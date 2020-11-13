package Exs1a4;

import java.util.Scanner;

public class Ex6 {
	public static void main(String args[])
	{
		int de,y,m,d;
		Scanner in=new Scanner(System.in);
		System.out.printf("How many days did you live until now? ");
		de=in.nextInt();
		in.nextLine();
		
		y=de/365;
		m=(de-(y*365))/30;
		d=de-(y*365+m*30);
		System.out.printf("Nice, so until now you have lived: "+y+" Years, "+m+" Months and "+d+" Days...");
	}

}
