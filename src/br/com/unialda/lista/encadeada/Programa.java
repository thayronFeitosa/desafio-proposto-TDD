package br.com.unialda.lista.encadeada;

public class Programa {

	public static void main(String[] args) {
		DinamicList list = new DinamicList();

		list.create();
		list.insert(4);
		list.insert(12);
		list.insert(7);
		list.insert(3);
		list.insert(2);
		list.insert(9);
		list.insert(1);
		list.insert(11);
		System.out.println();
		list.ordenar();
		System.out.println(list.toString());
	}

}
