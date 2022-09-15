package controller;

public class Ordenacao {

	public Ordenacao() {
		super();
	}
	
	public int[] quickSort(int[] vetor, int inicio, int fim) {//Pegar o vetor
		if(fim > inicio) {
			int posicaoPivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivoFixo - 1);
			quickSort(vetor, posicaoPivoFixo + 1, fim);
		}
		return vetor;
	}
	//M�todos auxiliares!
	private int dividir(int[] vetor, int inicio, int fim) {
		int ponteiroEsquerda = inicio + 1;//Segunda posi��o do vetor
		int ponteiroDireita = fim;//Fim do vetor
		int pivo = vetor[inicio];//Primeira posi��o como piv�
		
		while(ponteiroEsquerda <= ponteiroDireita) {
			//while(vetor[ponteiroEsquerda] <= pivo && ponteiroEsquerda <= ponteiroDireita)//Pode levar a um estouro!
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			//Idem em raz�o posi��o dos ponteiros pode ser maior que o tamanho do vetor
			while(vetor[ponteiroDireita] >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			if (ponteiroEsquerda < ponteiroDireita) {
				//Criar um m�todo de troca
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vetor, inicio, ponteiroDireita);//Aqui � a troca de posi��es!
		return ponteiroDireita;
	}
	private void trocar(int[] vetor, int i, int j) {//i ponteiro da esquerda e j ponteiro da direita
		int auxiliar = vetor[j];
		vetor[j] = vetor[i];//Vetor da direita, vai receber da esquerda
		vetor[i] = auxiliar;
	}
}
