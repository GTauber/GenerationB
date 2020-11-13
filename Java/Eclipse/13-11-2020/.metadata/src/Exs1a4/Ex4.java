package Exs1a4;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[])
	{
		int s,se,m,h;
		Scanner in=new Scanner(System.in);
		System.out.printf("How long your event lasted in seconds? ");
		se=in.nextInt();
		in.nextLine();
		
		h=(se/60)/60;
		m=se/60-h*60;
		s=se-(m*60);
		System.out.printf("Your event lasted for "+h+" Hours, "+m+" Minutes and "+s+" Seconds");
		
		
	}

}
