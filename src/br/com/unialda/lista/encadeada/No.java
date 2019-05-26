package br.com.unialda.lista.encadeada;

public class No {
	private No proximo;
	private int valor;

	public void create(int valor) {
		this.valor = valor;
		this.proximo = new No();
	}

	public void setNoProximo(No proximo) {
		this.proximo = proximo;
	}

	public No getNoProximo() {
		return proximo;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}
