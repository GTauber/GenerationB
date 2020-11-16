package Ex5a8;

/*
	8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
	for maior que 100, caso contrário imprimi-la com o valor zero.
*/

import java.util.*;

public class Ex8 {
	public static void main (String args[])
	{
		int a;
		Scanner in=new Scanner(System.in);
		System.out.printf("Type one number: ");
		a=in.nextInt();
		in.nextLine();
		if (a<=100)
		{
			a=0;
			System.out.printf("The value is not over than 100, so A="+a);
		}
		else
		{
			System.out.printf("The value is over than A="+a);
		}
		in.close();
	}

}
