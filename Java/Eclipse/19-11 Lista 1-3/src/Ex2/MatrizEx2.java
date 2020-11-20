package Ex2;

import java.util.Random;
import java.util.Scanner;

public class MatrizEx2 {
	public static void main (String args[])
	{
		
		Scanner in=new Scanner(System.in);
		Random rand=new Random();
		//int[][] N1={{2,2,2,2,2,2},{2,2,2,2,2,2},{2,2,2,2,2,2},{2,2,2,2,2,2}},	
			//	N2={{3,3,3,3,3,3},{3,3,3,3,3,3},{3,3,3,3,3,3},{3,3,3,3,3,3}},
						int[][] N1=new int [4][6],
								N2=new int [4][6],
				M1=new int[4][6],
				M2=new int[4][6];
						int m=25;
		System.out.println("Here are two matrices random generated, \nN1: ");
		for (int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
				int r=rand.nextInt(m)+1;
				N1[l][c]=r;
				System.out.printf("["+N1[l][c]+"]");
			}
			System.out.println();
		}
			System.out.println("N2: ");
		for (int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
				int r=rand.nextInt(m)+1;
				N2[l][c]=r;
				System.out.printf("["+N1[l][c]+"]");
			}
			System.out.println();
		}
		System.out.printf("Now, two matrices based on the two first's ones, M1 is the sum of the elements in same position on N1 and N2, "
				+ "and M2 is the opposite, the difference \nbetween elements in same position on N1 and N2;"
				+ "\nM1: \n");
		for (int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
				M1[l][c]=N1[l][c]+N2[l][c];
				System.out.printf("["+M1[l][c]+"]");
			}
			System.out.println();
		}
		System.out.println("M2");
		for (int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
				M2[l][c]=N1[l][c]-N2[l][c];
				System.out.printf("["+M2[l][c]+"]");
			}
			System.out.println();
		}
		in.close();
	}

}
