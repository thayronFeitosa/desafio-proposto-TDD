package br.com.unialda.lista.encadeada;

/**
 * 
 * @author thayron
 *
 */
public class DinamicList {
	private No start;
	private int size;

	public void create() {
		this.start = new No();
		this.size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void insert(int value) {
		No novoNo = new No();
		novoNo.setValor(value);

		No aux = this.start;

		while (aux.getNoProximo() != null) {
			aux = aux.getNoProximo();
		}
		aux.setNoProximo(novoNo);
		size++;
	}

	public int remove() throws RuntimeException {
		if (isEmpty()) {
			throw new RuntimeException("the lists is Empty");

		}
		No aux = this.start.getNoProximo();
		int remove = aux.getValor();
		this.start.setNoProximo(aux.getNoProximo());

		this.size--;
		return remove;
	}

	@Override
	public String toString() {
		No aux = this.start;
		String srt = "[";
		while (aux.getNoProximo() != null) {
			srt = srt + aux.getNoProximo().getValor() + ",";
			aux = aux.getNoProximo();
		}
		srt = srt + "]";
		return srt;

	}

	/**
	 * ODENA OS VALORES DA LISTA EM UM VETOR DE INTEIROS. DEPOIS QUE O VETOR ESTA
	 * PREECHIDO QUEBRASE O LAÇO DA LISTA PARA PODER INSERIR OS VALORES ORDENADOS
	 * QUE ESTÃO NO VETOR
	 */
	public void ordenar() {
		int[] vetor = new int[this.size];
		int cont = 0;
		No aux = this.start;
		while (aux.getNoProximo() != null) {
			vetor[cont] = aux.getNoProximo().getValor();
			aux = aux.getNoProximo();
			cont++;
		}
		cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] < vetor[j]) {

					cont = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = cont;
				}
			}
		}
		/**
		 * QUEBRA A LISTA ATUAL PARA INSERIR OS VALORES ATUAIS ORDENADOS
		 */
		No novoNo = new No();
		this.start = novoNo;

		for (int i = 0; i < vetor.length; i++) {
			insert(vetor[i]);
		}

	}

}
