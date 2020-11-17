package Exs4a6;
//	Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.
import java.util.*;

public class Ex4e5 {
	public static void main(String args[])
	{
		double b,a;
		int l;
		Scanner in=new Scanner(System.in);
		System.out.println("How many sides have your polygon? ");
		l=in.nextInt();
		in.nextLine();
		System.out.println("What is the measure of this side (Considering thats the same for all sides)? ");
		b=in.nextDouble();
		if (l<3)
		{
			System.out.printf("Not a Polygon.");
		}
		else if (l>5)
		{
			System.out.printf("UNIDENTIFIED POLYGON");
		}
		switch (l)
		{
		case 3:
			a=(Math.pow(b, 2)*Math.sqrt(3))/4;
			System.out.printf("Your polygon is a Tringle and his area is: "+a);
			break;
		case 4:
			a=Math.pow(b, 2);
			System.out.printf("Your polygon is a Square and his area is: "+a);
			break;
		case 5:
			System.out.printf("Your polygon is a Pentagon!!");
			break;
		}
		
		in.close();
	}

}
