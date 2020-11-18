package Exs1a5;

public class Ex1 {

	public static void main(String[] args) 
	{
		int a=1000,b;
		System.out.printf("This program tells you all the numbers between 1000 and 1999 that are divisible by 11\n");
		for(a=1000;a<2000;a++)
		{
			b=a%11;
			if (b==0)
			{
				System.out.printf("%d\n",a);
			}
			
		}
	}

}
