package Exs1a3;

/*
 	Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. A senha v�lida � o n�mero 1234. 
 	Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja v�lida.
 	ACESSO NEGADO caso a senha seja inv�lida.
 */
import java.util.*;

public class Ex2 {
	public static void main(String args[])
	{
		String a,b="1234";
		Scanner in=new Scanner(System.in);
		System.out.print("Type your password: ");
		a=in.next();
		if (a.equals(b))
		{
			System.out.printf("Ok, ACESSO PERMITIDO.");
		}
		else
		{
			System.out.printf("The password %s is invalid",a);
		}
		in.close();
	}

}
