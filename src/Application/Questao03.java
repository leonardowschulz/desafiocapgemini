package Application;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 1;
		int i, j;
		String palavra;
		String[] palavras = new String[100];
		
		System.out.println("Anailse de anagramas");
		System.out.print("Digite a palavra: ");
		palavra = sc.nextLine();
		
		System.out.println(palavra);
		
		for (i = 0; i < palavra.length(); i++) {
			for (j = i+1; j <= palavra.length(); j++) {
				palavras[i] = palavra.substring(i,j);
				
				
			}
		}
		
		Arrays.sort(palavras);
		for (i = 0; i <= palavras.length; i++) {
			System.out.println(palavras[i]);
		}

	}
}