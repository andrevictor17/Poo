


	import java.io.IOException;
	import java.util.Scanner;

	public class Aplicacao {
		
		private static Scanner scanner;
		public static void main(String args[]) throws IOException{
			Almoxarifado almo = new Almoxarifado();
			scanner = new Scanner(System.in);
			int sair = 0;
			int opcao = 0;
			while(sair == 0 ){
				switch(opcao){
					case 0:{
						almo.imprimirOpçoes();
						opcao = scanner.nextInt();
						break;
					}
					case 1:{
						almo.ListarProduto();
						opcao = 0;
						break;
					}
					case 2:{
						almo.cadastrarProduto();
						opcao = 0;
						break;
					}
					case 3:{
						almo.AlterarAluno();
						opcao = 0;
						break;
					}
					case 4:{
						almo.RemoveProduto();
						opcao = 0;
						break;
					}
					case 5:{
						sair = 1;
						System.out.println("\nAté mais!\n");
						break;
					}
					default:{
						almo.imprimirOpçoes();
						opcao = scanner.nextInt();
						break;
					}
				}
				
				
			}
		}
		
		
	}



