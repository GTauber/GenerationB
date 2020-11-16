package Ex1a4;
/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
import java.util.*;

public class Ex3 {
	public static void main (String args[])
	{
		double a,b,c,d;
		Scanner in=new Scanner(System.in);
		System.out.printf("Enter A:");
		a=in.nextDouble();
		a=Math.pow(a,2);
		in.nextLine();
		System.out.printf("Enter B:");
		b=in.nextDouble();
		b=Math.pow(b,2);
		in.nextLine();
		System.out.printf("Enter C:");
		c=in.nextDouble();
		c=Math.pow(c,2);
		if (c>=1000)
		{
			System.out.printf("The square of C is: "+c+" And is over 1000");
		}
		else 
		{
		in.nextLine();
		System.out.printf("Enter D:");
		d=in.nextDouble();
		d=Math.pow(d, 2);
		System.out.printf("the square of the values entered, respectively is "+a+", "+b+", "+c+", "+d);
		in.close();
		}
		
	}

}
