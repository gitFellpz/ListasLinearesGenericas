package listas;

import listas.ListaAlunos.NO;

public class ListaIntCrescente {

	private class NO{
		int dado;
		NO prox;
	}
	
	private NO lista = null;
	//Lista vazia (sem opreação init)
	
	public void insere(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		
		if(lista==null) {
			novo.prox = null;
			lista = novo;
		}
		else {
			if(novo.dado < lista.dado) {
				//o novo nó vai se tornar o primeiro da lista
				novo.prox = lista;
				lista = novo;
			}
			else {
				//o novo nó vai no 'meio' da lista (posição != da primeira)
				NO aux = lista;
				boolean achou = false;
				
				while(aux.prox != null && !achou) {
					if(aux.prox.dado < novo.dado)
						aux = aux.prox;
					else
						achou = true;
				}
				
				novo.prox = aux.prox;
				aux.prox = novo;
			}
		}
		
	}
	
	public void exibir() {
		NO aux = lista;
		int i = 1;
		
		while(aux != null) {
			System.out.print("\n" + i + " NO: " + aux.dado);
			i++;
			aux = aux.prox;
		}
	}
	
	public boolean remover(int valor) {
		boolean achou = false;
		//Ver se é o primeiro da fila
		if(lista.dado == valor) {
			lista = lista.prox;
		}
		else {
			NO aux = lista;
			while(aux.prox != null && !achou) {
				if(aux.prox.dado != valor) 
					aux = aux.prox;
				else {
					achou = true;
					aux.prox = aux.prox.prox;
				}
			}
		}
		return achou;
	}
	
	public int contaNos() {
		int cont = 0;
		//Percorre cada NO da lista
		NO aux = lista;
		while(aux != null) {
			cont++;
			aux = aux.prox;
		}
		return cont;
	}
	
	public void apresenta() {
		NO aux = lista;
		System.out.println("---LISTA---");
		while(aux != null) {
			System.out.println("\t "+aux.dado);
			aux = aux.prox;
		}
	}
	
	public void apresentaMaiores(int limite) {
		NO aux = lista;
		System.out.println("Valores maiores do que "+limite+" : ");
		while(aux != null) {
			if(aux.dado > limite)
				System.out.println("\t"+aux.dado);
			aux = aux.prox;
		}
	}
}
