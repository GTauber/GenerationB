package Ex1a4;
/*	Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
	horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
	por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
	armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
	trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
	excedente.
*/

import java.util.*;

public class Ex2 {
	public static void main (String args[])
	{
		int N;
		double E;
		String C;
		Scanner in = new Scanner(System.in);
		System.out.printf("Your work Code: ");
		C=in.next();
		in.nextLine();
		System.out.printf("Ok worker "+C+", Type your worked hours this week: ");
		N=in.nextInt();
		in.nextLine();
		if (N>50)
		{
			E=N-50;
			E=(20*E);
			System.out.printf("Ok. You worked a total of "+N+" Hours, that means you will receive: 500.0R$ for your normal work hours plus"
					+ " "+E+"R$ for your extra work hours.");
		}
		else
		{
			E=0;
			System.out.printf("Ok. You worked a total of "+N+" Hours, that means you will receive: "+N*10+"R$ for your normal work hours plus"
					+ " "+E+"R$ for your extra work hours.");
		}
		in.close();
		
	}

}
