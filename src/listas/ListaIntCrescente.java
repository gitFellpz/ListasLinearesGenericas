package listas;

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
	
}
