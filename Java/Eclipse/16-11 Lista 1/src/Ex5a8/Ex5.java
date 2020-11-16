package Ex5a8;
/*
	A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
	indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
	varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
	suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
	intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
	notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
	medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

import java.util.*;
public class Ex5 {
	public static void main(String args[])
	{
		double a;
		Scanner in=new Scanner(System.in);
		System.out.printf("Enter A:");
		a=in.nextDouble();
		in.nextLine();
		if (a>=0 && a<0.30)
		{
			System.out.printf("The pollution level are ok.");
		}
			else if (a>=0.30 && a<=0.39)
				{
					System.out.printf("The pollution level are over 0.3, so all the group 1 industries should be warned.");
				}
			else if (a>=0.4 && a<=0.49)
			{
				System.out.printf("The pollution level are over 0.4, so all group 1 and 2 industries should be warned.");
			}
			else if (a>=0.5)
			{
				System.out.printf("The pollution level are over 0.5, so all industries should be warned.");
			}
			else 
			{
				System.out.printf("Invalid value.");
			}
		in.close();
	}

}
