package Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Questao03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int opcao = 1;
		int i, j;
		int k = 0;
		int total = 0;
		String palavra;
		List<String> palavras = new ArrayList();
		List<String> teste1 = new ArrayList();
		
		System.out.println("Anailse de anagramas");
		System.out.print("Digite a palavra: ");
		palavra = sc.nextLine();

		System.out.println(palavra);
		
		for (i = 0; i < palavra.length(); i++) {
			for (j = i+1; j <= palavra.length(); j++) {
				palavras.add(palavra.substring(i,j));
			}
		}
		Collections.sort(palavras);
		

		for (i = 0; i < palavras.size(); i++) {

				teste1.add(sortString(palavras.get(i)));
				Collections.sort(teste1);
//				List<String> teste2 = new ArrayList();
	//			teste2.add(sortString(teste1.get(i)));
			
				total += Collections.frequency(teste1, teste1);
		}
		for (i = 0; i < palavras.size(); i++) {
			if (Collections.frequency(teste1, teste1.get(i)) > 1) {
				total += 1;
			}
		}
		// Dividido por 2, porque a ferramenta frequency procura quase vezes determinada palavra aparece na lista.
		// Aparecendo duas vezes, temos 1 anagrama.
		
		System.out.println(total / 2);
	}

	//Metodo para colocar as strings em ordem alfabética
	
	public static String sortString(String string) {
        char tempArray[] = string.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}