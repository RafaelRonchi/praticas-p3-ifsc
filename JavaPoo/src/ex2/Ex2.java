package ex2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int variavel;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor um valor primitivo, inteiro: ");
		int inteiro = ler.nextInt();
		variavel = inteiro;

		System.out.println("Agora informe um valor alfanumérico: ");
		String alfa = ler.next();
		variavel = alfa;

		// Erro ao tentar adicionar um valor de ums String para um inteiro
		// cannot convert from String to int
		ler.close();
	}

}
