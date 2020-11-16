package Ex5a8;

/*
	Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
	categorias:
	Infantil A = 5 a 7 anos
	Infantil B = 8 a 11 anos
	Juvenil A = 12 a 13 anos
	Juvenil B = 14 a 17 anos
	Adultos = Maiores de 18 anos
 */

import java.util.Scanner;

public class Ex6 {
	public static void main(String args[])
	{
		int a;
		Scanner in=new Scanner(System.in);
		System.out.printf("Type your Age:");
		a=in.nextInt();
		in.nextLine();
		if (a>=5 && a<=7)
		{
			System.out.printf("You belong to the group Infantil A.");
		}
			else if (a>=8 && a<=11)
				{
					System.out.printf("You belong to the group Infantil B.");
				}
			else if (a>=12 && a<=13)
			{
				System.out.printf("You belong to the group Jovem A.");
			}
			else if (a>=14 && a<=17)
			{
				System.out.printf("You belong to the group Jovem B.");
			}
			else if (a>=18)
			{
				System.out.printf("You belong to the Group Adulto.");
			}
			else if (a<5 && a>0)
			{
				System.out.printf("You're too young to take swim classes.");
			}
			else 
			{
				System.out.printf("Invalid Value");
			}
		in.close();
	}

}
