package Ex1a4;
/*
	Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
	n�mero � par ou �mpar, e se � positivo ou negativo.
 */

import java.util.*;
public class Ex4 {
	public static void main(String args[])
	{
		double a,b;
		Scanner in=new Scanner(System.in);
		System.out.printf("Type the number you wanna check if its evens or odds: ");
		a=in.nextDouble();
		b=a%2;
		if (b==0)
		{
			System.out.printf(a+" is Even!");
		}
		else 
		{
			System.out.printf(a+" Is Odd!");
		}
		in.close();
	}

}
