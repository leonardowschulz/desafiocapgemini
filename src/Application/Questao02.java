// Este programa � um sistema de confer�ncia de senhas. O usu�rio digita uma senha e o sistema confirma
// se ela � uma senha segura, ou quais caracter�sticas devem ser adicionadas para ela ficar segura

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
		
	// Come�ando a imprimir os dados e captando a senha. O comando while vai ficar pedindo uma nova senha
	// at� que uma senha segura seja digitada
		
		while (senhaAprovada == false) {
			System.out.println("Para criar sua senha, ela deve seguir os seguintes crit�rios:");
			System.out.println("Possuir no m�nimo 6 caracteres;");
			System.out.println("Conter no m�nimo um n�mero;");
			System.out.println("Contar no m�nimo uma letra min�scula;");
			System.out.println("Contar no m�nimo uma letra maiuscula;");
			System.out.println("Conter no m�nimo um dos caracteres especiais: !@#$%^&*()-+");
			System.out.println("");
			System.out.print("Digite a senha a ser criada: ");
			senha = sc.nextLine();
			espaco = digito = minusculo = maiusculo = especial = i = f = 0;
		
		// Aqui � feita a analise da senha, verificando se ela atende aos requisitos	
			
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
			
		// Aqui � verificado se a senha atendeu ou n�o os crit�rios, caso negativo, � explicado ao usu�rio
		// o que ele precisa fazer para deixar sua sennha segura
			
			if (maiusculo < 1 || minusculo < 1 || espaco > 0 || especial < 1 || digito < 1 || senha.length() < minimoCaracteres) {
				System.out.println("Tente novamente. Sua senha precisa conter: ");
				if (senha.length() < minimoCaracteres) {
					System.out.println("Conter mais " + (minimoCaracteres - senha.length()) + " caracteres;");
				}
				if (maiusculo < 1) {
					System.out.println("Ao menos uma letra mai�scula;");
				}
				if (minusculo <1) {
					System.out.println("Ao menos uma letra min�scula;");
				}
				if (espaco > 0) {
					System.out.println("Ela n�o pode conter espa�os;");
				}
				if (especial < 1) {
					System.out.println("Ao menos um caractere especial: !@#$%^&*()-+;");
				}
				if (digito < 1) {
					System.out.println("Ao menos um n�mero;");
				}
				System.out.println("Tecle ENTER para continua e tente novamente.");
				sc.nextLine();

			}
			
		// Assim que a senha estiver correta, o programa encerra o loop, informa que a senha
		// est� aprovada e encerra o programa
			
			else {
				senhaAprovada = true;
			}		
		}
		System.out.println("Senha aprovada.");
	}
}
