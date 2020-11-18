package Exs1a5;

import java.util.*;

public class Ex3 {
	public static void main(String args[])
	{
		int a=0,under=0,over=0;
		Scanner in=new Scanner(System.in);
		while (a!=-99)
		{
			System.out.printf("\nInsert the Age of the participants: ");
			a=in.nextInt();
			if(a<21)
			{
				under=under+1;
			}
			else if(a>50)
			{
				over=over+1;
			}

		}
		System.out.printf("Finish. We have until now %d Under 21 years, and %d Over 50 years.",under,over);
		in.close();
	}

}
