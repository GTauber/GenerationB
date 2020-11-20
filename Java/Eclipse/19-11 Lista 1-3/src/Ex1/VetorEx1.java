package Ex1;

import java.util.*;

public class VetorEx1 {
	public static void main (String args[])
	{
		Scanner in=new Scanner(System.in);
		Random rand=new Random();
		int[] V=new int[10];
		int m,sum=0,gn=0,cgn=0;
		float av;
		System.out.printf("Please insert the largest number on your dice: ");
		m=in.nextInt();
		for (int i=0;i<V.length;i++)
		{
			
			int r=rand.nextInt(m)+1;
			V[i]=r;
			sum=V[i]+sum;
			if (V[i]>gn)
			{
				gn=V[i];
				cgn=0;
			}
			if (gn==V[i])
			{
				cgn=cgn+1;
			}
				
		}
		for (int i=0;i<10;i++)
		{
			System.out.printf("%dth Launch: %d\n",i+1,V[i]);
		}
		av=sum/10;
		System.out.printf("Average of all launchs: %.2f\nHighest number obtained: %d\nHow many "
				+ "times the highest number was taken: %d Times",av,gn,cgn);
		in.close();
	}

}
