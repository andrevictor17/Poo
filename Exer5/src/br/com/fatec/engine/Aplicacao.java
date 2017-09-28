package br.com.fatec.engine;


import java.io.IOException;
import java.util.Scanner;

import br.com.fatec.modelo.Aluno;

public class Aplicacao {
	
	private static Scanner scanner;
	
	public static void main(String args[]) throws IOException{
		scanner = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int sair = 0;
		int opcao = 0;
		while(sair == 0 ){
			switch(opcao){
				case 0:{
					agenda.imprimirOpçoes();
					opcao = scanner.nextInt();
					break;
				}
				case 1:{
					agenda.ListarAluno();
					agenda.ListarProfessor();
					opcao = 0;
					break;
				}
				case 2:{
					agenda.cadastrarAluno();
					opcao = 0;
					break;
				}
				case 3:{
					agenda.cadastrarProfessor();
					opcao = 0;
					break;
				}
				case 4:{
					agenda.AlterarAluno();
					opcao = 0;
					break;
				}
				case 5:{
					agenda.AlterarProfessor();
					opcao = 0;
					break;
				}
				case 6:{
					agenda.RemoveAluno();
					opcao = 0;
					break;
				}
				case 7:{
					agenda.RemoveProfessor();
					opcao = 0;
					break;
				}
				case 8:{
					sair = 1;
					System.out.println("\nAté mais!\n");
					break;
				}
				default:{
					agenda.imprimirOpçoes();
					opcao = scanner.nextInt();
					break;
				}
			}
			
			
		}
	}
	
	
}
