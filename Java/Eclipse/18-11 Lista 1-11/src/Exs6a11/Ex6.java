package Exs6a11;

import java.util.*;

public class Ex6 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int b=0,d=0,p,k;
		double a,s,ts=0,c=0;
		String name;
		for (p=1;p<3;p++)
		{
			System.out.printf("You are the %dth of 20 inhabitants, what's your name? \n",p);
			name=in.next();
			in.nextLine();
			System.out.printf("Hello %s, please enter with your actual salary. \n",name);
			s=in.nextDouble();
			if(s>c)
			{
				c=s;
			}
			if (s<=100)
			{
				d=d+1;
			}
			in.nextLine();
			System.out.printf("Next question: how many kids do you have? \n");
			k=in.nextInt();
			System.out.printf("\n\n\n\n\n\n\n\n\n\n");
			if (p<20)
			{
				System.out.printf("Next!\n");
			}
			ts=ts+s;
			b=b+k;
			in.close();
		}
		a=ts/20;
		b=b/20;
		//c ok
		d=(d*100)/20;
		System.out.printf("Ok, you finished entering with the entire population of the city, so here are the values needed: "
				+ "\nA) Average Salary: %.2f\nB) Average kids per inhabitant: %d\nC) Greater Salary: %.2f\nD) Percetage of people with"
				+ "salary between 0$ and 100$: %d%%",a,b,c,d);

		
	}

}
