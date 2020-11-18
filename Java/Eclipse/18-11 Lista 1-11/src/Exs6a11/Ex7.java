package Exs6a11;

public class Ex7 {
	public static void main(String args[])
	{
		int a,s=0;
		for(a=0;a<11;a++)
		{
			if(a%2!=0 && a%3==0)
			{
				System.out.printf(a+"\n");
				s=s+a;
			}
			else
			{
				System.out.printf(a+"\n");
			}
		}
		System.out.printf("The sum of all odd number divisible by 3 is: %d",s);
	}

}
