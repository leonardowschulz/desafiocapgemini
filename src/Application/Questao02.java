// Este programa é um sistema de conferência de senhas. O usuário digita uma senha e o sistema confirma
// se ela é uma senha segura, ou quais características devem ser adicionadas para ela ficar segura

package Application;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String senha;
		String caractereEspecial = "!@#$%^&*()-+";
		int minimoCaracteres = 6;
		int espaco, digito, minusculo, maiusculo, especial, i, f;
		boolean senhaAprovada = false;
		
	// Começando a imprimir os dados e captando a senha. O comando while vai ficar pedindo uma nova senha
	// até que uma senha segura seja digitada
		
		while (senhaAprovada == false) {
			System.out.println("Para criar sua senha, ela deve seguir os seguintes critérios:");
			System.out.println("Possuir no mínimo 6 caracteres;");
			System.out.println("Conter no mínimo um número;");
			System.out.println("Contar no mínimo uma letra minúscula;");
			System.out.println("Contar no mínimo uma letra maiuscula;");
			System.out.println("Conter no mínimo um dos caracteres especiais: !@#$%^&*()-+");
			System.out.println("");
			System.out.print("Digite a senha a ser criada: ");
			senha = sc.nextLine();
			espaco = digito = minusculo = maiusculo = especial = i = f = 0;
		
		// Aqui é feita a analise da senha, verificando se ela atende aos requisitos	
			
			for (i = 0; i < senha.length(); i++) {
				for (f = 0; f < caractereEspecial.length(); f++) {
					if (caractereEspecial.charAt(f) == senha.charAt(i)) {
						especial += 1;
					}
				}
				if (Character.isWhitespace(senha.charAt(i))) {
					espaco += 1;
				}
				if (Character.isDigit(senha.charAt(i))) {
					digito += 1;
				}
				if (Character.isUpperCase(senha.charAt(i))) {
					maiusculo += 1;
				}
				if (Character.isLowerCase(senha.charAt(i))) {
					minusculo += 1;
				}
		
			}
			
		// Aqui é verificado se a senha atendeu ou não os critérios, caso negativo, é explicado ao usuário
		// o que ele precisa fazer para deixar sua sennha segura
			
			if (maiusculo < 1 || minusculo < 1 || espaco > 0 || especial < 1 || digito < 1 || senha.length() < minimoCaracteres) {
				System.out.println("Tente novamente. Sua senha precisa conter: ");
				if (senha.length() < minimoCaracteres) {
					System.out.println("Conter mais " + (minimoCaracteres - senha.length()) + " caracteres;");
				}
				if (maiusculo < 1) {
					System.out.println("Ao menos uma letra maiúscula;");
				}
				if (minusculo <1) {
					System.out.println("Ao menos uma letra minúscula;");
				}
				if (espaco > 0) {
					System.out.println("Ela não pode conter espaços;");
				}
				if (especial < 1) {
					System.out.println("Ao menos um caractere especial: !@#$%^&*()-+;");
				}
				if (digito < 1) {
					System.out.println("Ao menos um número;");
				}
				System.out.println("Tecle ENTER para continua e tente novamente.");
				sc.nextLine();

			}
			
		// Assim que a senha estiver correta, o programa encerra o loop, informa que a senha
		// está aprovada e encerra o programa
			
			else {
				senhaAprovada = true;
			}		
		}
		System.out.println("Senha aprovada.");
	}
}
