package exer6;


import java.util.Scanner;

public class Aplicacao {
	private static Scanner scanner;
	
	public static void main(String args[]){
		scanner = new Scanner(System.in);
		Dados agenda = new Dados();
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
					agenda.imprimirCliente();
					opcao = 0;
					break;
				}
				case 2:{
					agenda.cadastrarCliente();
					opcao = 0;
					break;
				}
				case 3:{
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
