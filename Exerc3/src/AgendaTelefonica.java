

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class AgendaTelefonica {
	//private Pessoa[] pessoas;
	//ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	Vector<Pessoa> pessoas = new Vector<Pessoa>(5);
	private Scanner scanner;
	
	
	public AgendaTelefonica(){
		//pessoas = new Pessoa[5];
		scanner = new Scanner(System.in);
		
	}
	
	public void cadastrarPessoa(){
		/*
		for(int i = 0;i < 5;i++){
			if(pessoas == null){
				*/
				System.out.println("\nInsira um nome para a pessoa: \n");
				String nome = scanner.next();
				System.out.println("\nInsira um telefone para a pessoa: \n");
				String telefone = scanner.next();
				System.out.println("\nInsira um email para a pessoa: \n");
				String email = scanner.next();
				Pessoa nova = new Pessoa(nome,telefone,email);
				pessoas.addElement(nova);
				//pessoas.add(nova);
				System.out.println("\nNovo contato adicionado\n");
				
				//break;
				

		
	}
	public void imprimirOpçoes(){
		System.out.println("\nEscolha uma das opï¿½ï¿½es: \n");
		System.out.println("1 - Listar contatos. \n");
		System.out.println("2 - Incluir contatos.\n");
		System.out.println("3 - sair. \n");
	}
	
	public void imprimirPessoas(){
		
	      for (Pessoa pessoa : pessoas) {
				System.out.println("Nome:"+pessoa.getNome());
				System.out.println("Telefone:"+pessoa.getTelefone());
				System.out.println("Email:"+pessoa.getEmail());
				
			}
	   
		/*
		for (Pessoa pessoa : pessoas) {
			System.out.println("Nome:"+pessoa.getNome());
			System.out.println("Telefone:"+pessoa.getTelefone());
			System.out.println("Email:"+pessoa.getEmail());
			
		}
		*/
		/*for (Pessoa pessoa:pessoas){
			if (pessoa!=null){
				System.out.println("\nNome : " +pessoa.getNome()+ "\nTelefone: "
						+pessoa.getTelefone()+"\nEmail:" +pessoa.getEmail());
					
			}
		}*/
	}
	public Vector<Pessoa> getPessoas(){
		return pessoas;
	}
	public void setPessoas(Vector pessoas){
		this.pessoas = pessoas;
	}
}


