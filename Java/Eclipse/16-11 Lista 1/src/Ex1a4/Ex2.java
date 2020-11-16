package Ex1a4;
/*	Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
	horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
	por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
	armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
	trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
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
