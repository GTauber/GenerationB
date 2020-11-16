package Ex1a4;
/*	1) João TOMATEIRO, comprou um microcomputador para controlar o rendimento diário
	de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
	regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
	excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
	verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
	da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
	ZERO.
 */

import java.util.*;

public class Ex1 {
	public static void main(String args[])
	{
		int P,E;
		double M;
		Scanner in = new Scanner(System.in);
		System.out.printf("Hello Joao TOMATEIRO, tell me, how much tomatos you tooked today?\n");
		P = in.nextInt();
		in.nextLine();
		if (P>50)
		{
			E=P-50;
			M=4*E;
			System.out.printf("Ok. You took "+E+"Kg over than 50kg, so, pay up plus "+M+" R$ Reais.");
		}
		else
		{
			System.out.printf("Ok. You Got a total of "+P+"kg, no Excess, pay up just the quantity you took, no penalty.");
		}
		in.close();
	}

}
