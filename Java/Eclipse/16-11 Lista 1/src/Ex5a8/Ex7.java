package Ex5a8;

/*
	Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
	(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
 */

import java.util.Scanner;

public class Ex7 {
	public static void main(String args[])
	{
		int b,h,a;
		Scanner in=new Scanner(System.in);
		System.out.printf("Triangle Area Calculator, enter the base size: ");
		b=in.nextInt();
		in.nextLine();
		System.out.printf("Ok, now the height: ");
		h=in.nextInt();
		if (b>0 && b>0)
		{
			a=(b*h)/2;
			System.out.printf("Triangle Area = "+a+"m�");
		}

			else if(b<0)
			{
				System.out.printf(b+" Is not a valid value for base size");
			}
			else if(h<0)
			{
				System.out.printf(h+" Is not a valid value for height size");
			}
		in.close();
	}
}
