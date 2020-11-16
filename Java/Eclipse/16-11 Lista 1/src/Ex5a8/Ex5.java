package Ex5a8;
/*
	A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
	ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
	varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
	suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
	intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
	notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o
	medido e emita a notifica��o adequada aos diferentes grupos de empresas.
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
