programa
{
	/*
	 * 1- Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	 *	 atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	 */
	funcao inicio()
	{
		inteiro vet[5],y,maior
		maior = vet[0]
		para (y=0;y<5;y++)
		{
			escreva("Digite os resultados das pontuações: ")
			leia(vet[y])
			se (maior<vet[y])
				{
					maior=vet[y]
				}
		
		}
		para (y=0;y<4;y++)
		{
			se(y==0)
			{
				escreva("As pontuações informadas foram, respectivamente: ")
			}
			escreva(vet[y]," ")
		}
		escreva(vet[4],". E a maior pontuaçao foi de ",maior".")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */