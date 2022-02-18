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
			else {
				senhaAprovada = true;
			}		
		}
		System.out.println("Senha aprovada.");
	}
}
