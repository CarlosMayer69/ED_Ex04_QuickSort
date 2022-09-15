package view;

import controller.Ordenacao;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		Ordenacao ordenacao = new Ordenacao();
		vetor = ordenacao.quickSort(vetor, 0, vetor.length - 1);
		
		for (int valor : vetor) {
			System.out.print(valor);
			System.out.print(" ");
		}

	}

}
