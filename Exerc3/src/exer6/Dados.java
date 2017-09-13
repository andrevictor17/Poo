package exer6;

import java.util.Scanner;
import java.util.Vector;

public class Dados {
	
	Vector<Cliente> cliente = new Vector<Cliente>();
	Vector<Dinheiro> dinheiro = new Vector<Dinheiro>();
	private Scanner scanner;
	double soma;
	
	
	public Dados(){
		scanner = new Scanner(System.in);
	}
	
	public void cadastrarCliente(){

				System.out.println("\n--------CLIENTE----------------: \n");
				System.out.println("\nInsira um nome para o cliente: \n");
				String nome = scanner.next();
				System.out.println("\nInsira um telefone para o cliente: \n");
				String telefone = scanner.next();
				System.out.println("\nInsira um email para o cliente: \n");
				String email = scanner.next();
				System.out.println("\nInsira um endereço para o cliente: \n");
				String endereco = scanner.next();
				
				System.out.println("\n--------GASTOS----------------: \n");
				
				System.out.println("\nInsira o dinheiro gasto em janeiro: \n");
				Double janeiro = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em fevereiro: \n");
				Double fevereiro = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em março: \n");
				Double marco = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em abril: \n");
				Double abril = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em maio: \n");
				Double maio = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em junho: \n");
				Double junho = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em julho: \n");
				Double julho = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em agosto: \n");
				Double agosto = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em setembro: \n");
				Double setembro = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em outubro: \n");
				Double outubro = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em novembro: \n");
				Double novembro = scanner.nextDouble();
				System.out.println("\nInsira o dinheiro gasto em dezembro: \n");
				Double dezembro = scanner.nextDouble();
				
				soma = janeiro+fevereiro+marco+abril+maio+junho+julho+agosto+setembro+outubro+novembro+dezembro;
				Cliente novoCliente = new Cliente(nome,telefone,email,endereco);
				Dinheiro novoDinheiro = new Dinheiro(janeiro,fevereiro,marco,abril,maio,junho,julho,agosto,setembro,outubro,novembro,dezembro,soma);
								
				dinheiro.add(novoDinheiro);
				cliente.add(novoCliente);
				System.out.println("\nNovo contato adicionado\n");

	}
	public void imprimirOpçoes(){
		System.out.println("\nEscolha uma das opições: \n");
		System.out.println("1 - Listar contatos. \n");
		System.out.println("2 - Incluir contatos.\n");
		System.out.println("3 - sair. \n");
	}
	
	public void imprimirCliente(){
			System.out.println("------Cliente------");
	      for (Cliente cliente : cliente) {
				System.out.println("Nome:"+cliente.getNome());
				System.out.println("Telefone:"+cliente.getTelefone());
				System.out.println("Email:"+cliente.getEmail());
				System.out.println("Endereço:"+cliente.getEndereco());
			}
	      	System.out.println("------Dinheiro------");
	      for (Dinheiro dinheiro : dinheiro) {
				System.out.println("Janeiro:"+dinheiro.getJaneiro());
				System.out.println("Fevereiro:"+dinheiro.getFevereiro());
				System.out.println("Março:"+dinheiro.getMarco());
				System.out.println("Abril:"+dinheiro.getAbril());
				System.out.println("Maio:"+dinheiro.getMaio());
				System.out.println("Junho:"+dinheiro.getJunho());
				System.out.println("Julho:"+dinheiro.getJulho());
				System.out.println("Agosto:"+dinheiro.getAgosto());
				System.out.println("Setembro:"+dinheiro.getSetembro());
				System.out.println("Outubro:"+dinheiro.getOutubro());
				System.out.println("Novembro:"+dinheiro.getNovembro());
				System.out.println("Dezembro:"+dinheiro.getDezembro());
				System.out.println("Soma do gasto anual:"+dinheiro.getSoma());
			}
 		
	}
	public Vector<Cliente> getclientes(){
		return cliente;
	}
	public void setclientes(Vector<Cliente> cliente){
		this.cliente = cliente;
	}
	public Vector<Dinheiro> getdinheiro(){
		return dinheiro;
	}
	public void setdinheiro(Vector<Dinheiro> dinheiro){
		this.dinheiro = dinheiro;
	}

}
