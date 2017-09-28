import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Almoxarifado {
		public Scanner scanner;
		
	public void cadastrarProduto() throws IOException{
		scanner = new Scanner(System.in);
		Arquivo arquivo = new Arquivo();
		System.out.println("\nInsira um nome para o Produto: \n");
		String nome = scanner.next();
		System.out.println("\nInsira a quantidade de Produto: \n");
		int quant = scanner.nextInt();
		Produto p = new Produto(nome,quant);
		arquivo.addProduto(p);
		System.out.println("\nNovo Produto adicionado\n");
	}
	
	public void AlterarAluno() throws IOException{
		Arquivo arquivo = new Arquivo();
		Almoxarifado almoxarifado = new Almoxarifado();
		scanner = new Scanner(System.in);
		almoxarifado.ListarProduto();
		System.out.println("Digite o nome de qual Produto voce deseja editar:");
		String nome = scanner.next();
		Produto p = new Produto(nome,0);
		arquivo.updateProduto(p);
		
	}
	public void RemoveProduto() throws IOException{
		Arquivo arquivo = new Arquivo();
		Almoxarifado almoxarifado = new Almoxarifado();
		scanner = new Scanner(System.in);
		almoxarifado.ListarProduto();
		System.out.println("Digite o nome de qual produto voce deseja Deletar:");
		String nome = scanner.next();
		Produto p = new Produto(nome,0);
		arquivo.removeProduto(p);
		
	}
	
	public void imprimirOpçoes(){
		System.out.println("\nEscolha uma das opiçoes: \n");
		System.out.println("1 - Listar Produto. \n");
		System.out.println("2 - Incluir Produto. \n");
		System.out.println("3 - Alerar Produto.\n");
		System.out.println("4 - Excluir Produto. \n");
		System.out.println("5 - sair. \n");
	}
	
	public void ListarProduto() throws IOException{
		Arquivo arquivo = new Arquivo();
		ArrayList<Produto> produto = arquivo.PesquisaProduto(new Produto("",0));
	
		System.out.println("Lista de Produto:");
		System.out.println("---------------------------------------------------------------------------");
		for (Produto produtos:produto) {
			System.out.println("Nome: "+produtos.getNome());
			System.out.println("Quantidade: "+produtos.getQuant());
			System.out.println("---------------------------------------------------------------------------");
			}
		
		
		
		
		
	}

}
