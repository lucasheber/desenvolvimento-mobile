/**
 * 
 */
package dev.lucasheber.main;

import java.util.Scanner;

import dev.lucas.classes.RoboPremium;

/**
 * @author Lucks
 *
 */
public class Main {

	public static void main(String[] args) {
		iniciar();
	}

	public static void iniciar() {
		System.out.println("Marciano: Seja bem vindo, em que posso ajuda-lo?\nVoce: ");

		RoboPremium robo = new RoboPremium();
		String read = "";

		read = ler();

		while (!read.equalsIgnoreCase("FIM")) {

			robo.analizaTipoPergunta(read);

			System.out.println("Marciano: " + robo.responda());
			System.out.println("Voce: ");
			read = ler();
		}

		System.out.println("\nAte logo!!");
	}

	@SuppressWarnings("resource")
	public static String ler() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
