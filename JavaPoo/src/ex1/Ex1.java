package ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		/*
		 * Crie uma variável do tipo String de nome qualqer. 
		 * Tente atribuir a ela um
		 * valor alfanumérico (String) e um valor
		 * numérico de tipo primitivo (int,
		 * double, float…). O que acontece e por quê?
		 */
		
		String nome; 
		System.out.println("Tente atribur um valor alfanumérico: ");
		String s1 = ler.next();
		nome = s1;
		System.out.println("Resultado: "+ nome );
		System.out.println("Tente atribur um valor inteiro: ");
		Integer s2 = Integer.valueOf(ler.nextLine());
		nome = s2;
		System.out.println("Resultado: "+ nome );
		
		// Erro por tentar atribuir um valor primitivo em uma string
		// cannot convert from String to Integer
		ler.close();
	}

}
