package teste;

import java.util.Scanner;

import listas.ListaIntCrescente;

public class MainTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ListaIntCrescente lista = new ListaIntCrescente();
		System.out.println("Informe dado positivo para inserir ou negativo para encerrar");
		
		int valor = input.nextInt();
		while (valor >= 0) {
			lista.insere(valor);
			lista.exibir();
			
			System.out.println("\nInforme dado positivo para inserir ou negativo para encerrar ");
			valor = input.nextInt();
		}
		input.close();
	}

}
