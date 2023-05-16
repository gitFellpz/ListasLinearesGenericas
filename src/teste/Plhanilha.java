package teste;

import java.util.Scanner;
import entidades.Aluno;
import listas.ListaAlunos;

public class Plhanilha {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ListaAlunos turma = new ListaAlunos();
		
		int rm;
		double media;
		int resp = 1;
		
		do {
			System.out.print("\nRM: ");
			rm = input.nextInt();
			System.out.print("\nMedia: ");
			media = input.nextDouble();
			
			Aluno aluno = new Aluno(rm, media);
			
			turma.insere(aluno);
			
			turma.apresenta();
			
			System.out.print("\nDeseja cadastrar mais 1 aluno? (1-Sim):");
			resp = input.nextInt();
		} while (resp == 1);
		input.close();
	}
}
