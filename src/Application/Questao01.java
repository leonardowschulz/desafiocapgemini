// Este programa imprime na tela uma escada, onde o usu�rio informa um n�mero, que serve para informar
// ao sistema quantas linhas e caracteres por linha a escada vai ter

package Application;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		int numero = 1;
		
		Scanner sc = new Scanner(System.in);
		
		// While para permitir testar o programa v�rias vezes, ou teclar 0 para encerrar ele
		
		while (numero != 0) {
			System.out.print("Digite o numero para montar a escada ou 0(zero) para encerrar o programa: ");
			numero = sc.nextInt();				
			
		// Chamano o m�todo Escada que monta o desenho a partir do n�mero digitado	
			
			Escada(numero);
		}
		
		sc.close();
	}

	// M�todo Escada
	
	public static void Escada(int numero) {
		int i, j, k, l, m;
		k = numero;
		m = 1;
		
	// For para organizar cada linha
		
		for (i = 1; i <= numero; i++) {
			for (j =1; j <= k; j++) {
				System.out.print(" ");				
			}
			k -= 1;
			for (l = 1; l <= m; l++) {
				System.out.print("*");
			}
			m += 1;
			System.out.println();
			
		}
		
	}

}
