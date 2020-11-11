programa
{
	/*	4.   Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
			em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
			diagonal, ou seja, diagonal principal.
	*/
	funcao inicio()
	{
		const inteiro linha=3,coluna=3
		inteiro M3[linha][coluna],l,c,soma=0,diagonal=0
		escreva("A seguir digite os valores para a matriz 3x3.\n")
		para (l=0;l<linha;l++)
		{
			para(c=0;c<coluna;c++)
			{
				escreva("Insira o valor de posição: [",l,"][",c,"]")
				leia (M3[l][c])
			}
		}
		escreva("A matriz 3x3 inserida foi: \n")
		para (l=0;l<linha;l++)
		{
			para(c=0;c<coluna;c++)
			{
				escreva("[",M3[l][c],"]")
			}
			escreva("\n")
		}
		para (l=0;l<linha;l++)
		{
			para(c=0;c<coluna;c++)
			{
				 soma=soma+M3[l][c]
				 se(l==c)
				 {
				 	diagonal=diagonal+M3[l][c]
				 }
			}
		}
		escreva(soma," ",diagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 875; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */