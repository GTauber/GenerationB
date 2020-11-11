programa
{

	/*
	  2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		 que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		 imprima a média aritmética dos lançamentos, contabilize e apresente também
		 quantas foram as ocorrências da maior pontuação.
		 
	 */
	funcao inicio()
	{
		inteiro vet[10],y,maior,rep=0
		maior = vet[0]
		para (y=0;y<10;y++)
		{
			escreva("Digite os resultados das pontuações: ")
			leia(vet[y])
			se (maior<vet[y])
				{
					maior=vet[y]
					rep=0
				}
			se (vet[y]==maior)
			{
				rep++
			}
		}
		para (y=0;y<10;y++)
		{
			se (y==0)
			{
				escreva("O dado foi lançado 10 vezes e os valores obtidos em cada lançamento foram respectivamente: ")
			}
			escreva(vet[y]," ")
			se (y==9)
			{
				escreva("As quantia de vezes que o maior valor foi tirado no dado foi de ",rep)
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 867; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */