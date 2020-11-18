package Exs6a11;

import java.util.*;

public class Ex8 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=1,d=0;
		double c=0,b=0;
		System.out.printf("Hello, enter here one positive number (if you wanna stop, just enter a negative one): ");
		while (a>0)
		{
			System.out.printf("%dth number: ",d+1);
			a=in.nextInt();
			in.nextLine();
			if(a>0) {
				b=b+a;
				d=d+1;
				}
		}
		c=b/d;
		System.out.printf("Alright, the required information is:\nSum: %.0f\nAverage: %.2f\nTotal of numbers: %d",b,c,d);
		in.close();
	}

}
