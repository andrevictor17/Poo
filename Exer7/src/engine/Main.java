package engine;

import java.io.IOException;
import java.util.Scanner;



public class Main {
	

	private static Scanner scanner;
	
	public static void main(String args[]) throws IOException{
		scanner = new Scanner(System.in);
		Fluxo fluxo = new Fluxo();
		int sair = 0;
		int opcao = 0;
	
		while(true){
		if(fluxo.Login() == true){
			System.out.println("\nteste!\n");
			while(sair == 0 ){
				switch(opcao){
					case 0:{
						fluxo.imprimirOp�oes();
						opcao = scanner.nextInt();
						break;
					}
					case 1:{
						fluxo.ListarCaixa();
						opcao = 0;
						break;
					}
					case 2:{
						fluxo.cadastrarCaixa();
						opcao = 0;
						break;
					}
					case 3:{
						fluxo.AlterarCaixa();
						opcao = 0;
						break;
					}
					case 4:{
						fluxo.RemoveProduto();
						opcao = 0;
						break;
					}
					case 5:{
						sair = 1;
						System.out.println("\nAt� mais!\n");
						break;
					}
					default:{
						fluxo.imprimirOp�oes();
						opcao = scanner.nextInt();
						break;
					}
				}
				
				
			}
			break;
		}
		
		else{
			System.out.println("\nUsuario n�o existe!\n");
		}
		
		
		}
	
	}
	}



