package pack1;

import java.util.Scanner;

public class TarefaJava {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a senha: ");
		String senha = teclado.nextLine();

		if (senhaValida(senha)) {
			System.out.println("Senha válida");
		} else {
			System.out.println("Senha inválida");
		}

		teclado.close();
	}

	private static boolean senhaValida(String senha) {

		if (senha.length() < 8) {
			return false;
		}

		boolean maiuscula = false;
		boolean minuscula = false;
		boolean numero = false;

		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);

			if (Character.isUpperCase(c)) {
				maiuscula = true;
			}

			if (Character.isLowerCase(c)) {
				minuscula = true;
			}

			if (Character.isDigit(c)) {
				numero = true;
			}
		}

		if (maiuscula && minuscula && numero) {
			return true;
		} else {
			return false;
		}
	}

}
