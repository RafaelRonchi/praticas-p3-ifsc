package ex7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[];
		int x;
		int ax;
		vetor = new int[10];

		System.out.println("Informe os valores de 1 a 10");
		for (x = 0; x < 10; x++) {
			vetor[x] = ler.nextInt();
		}

		// CRESCENTE
		for (x = 0; x < vetor.length; x++) {
			for (int i = 0; i < 9; i++) {
				if (vetor[i] > vetor[i + 1]) {
					ax = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = ax;
				}
			}
		}
		System.out.println("Resultado crescente:");
		for (x = 0; x < 10; x++) {
			System.out.println(" " + vetor[x]);
		}

		// DECRESCENTE
		for (int i = 1; i < vetor.length; i++) {
		    for ( x = 0; x < i; x++) {
		        if (vetor[i] > vetor[x]) {
		            int temp = vetor[i];
		            vetor[i] = vetor[x];
		            vetor[x] = temp;
		        }
		    }
		}
		
		System.out.println("Resultado decrescente:");
		for (x = 0; x < 10; x++) {
			System.out.println(" " + vetor[x]);
			ler.close();

	}
	}
}
