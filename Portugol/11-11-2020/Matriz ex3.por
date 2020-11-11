programa
{
		/*	3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2.
		*/	
	funcao inicio()
	{
		const inteiro linha=4,coluna=6
		inteiro N1[linha][coluna]= 
							 {
								{2,2,2,2,2,2},
								{2,2,2,2,2,2},
								{2,2,2,2,2,2},
								{2,2,2,2,2,2}
		}
		inteiro l,c, N2[linha][coluna]= 
					   		      {
								  {1,1,1,1,1,1},
								  {1,1,1,1,1,1},
								  {1,1,1,1,1,1},
								  {1,1,1,1,1,1}
		}
		escreva("As matrizes N1 E N2 São respectivamente:\n")
		para (l=0;l<linha;l++)
		{
			para (c=0;c<coluna;c++)
			{
				escreva("[",N1[l][c],"]")
			}
			escreva("\n")
		}
		escreva("------------------\n")
		para (l=0;l<linha;l++)
		{
			para (c=0;c<coluna;c++)
			{
				escreva("[",N2[l][c],"]")
			}
			escreva("\n")
		}
		inteiro M1[linha][coluna], M2[linha][coluna]
		para (l=0;l<linha;l++)
		{
			para (c=0;c<coluna;c++)
			{
				M1[l][c] = N1[l][c]+N2[l][c]
				M2[l][c] = N1[l][c]-N2[l][c]
			}
		}
		escreva("3(a):Soma dos elementos da matriz N1 E N2:\n")
		para (l=0;l<linha;l++)
		{
			para (c=0;c<coluna;c++)
			{
				escreva("[",M1[l][c],"] ")
			}
			escreva("\n")
		}
		escreva("3(b): A diferença entre os elementos da matriz N1 e N2 é de:\n")
		para (l=0;l<linha;l++)
		{
			para (c=0;c<coluna;c++)
			{
				escreva("[",M2[l][c],"] ")
			}
			escreva("\n")
			//also teste
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */