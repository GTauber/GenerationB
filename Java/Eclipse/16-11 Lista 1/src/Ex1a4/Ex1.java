package Ex1a4;
/*	1) Jo�o TOMATEIRO, comprou um microcomputador para controlar o rendimento di�rio
	de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
	regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
	excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
	verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
	da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
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
