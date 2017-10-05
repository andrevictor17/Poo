package engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import br.com.fatec.Caixa;
import br.com.fatec.CaixaDao;
import br.com.fatec.User;
import br.com.fatec.userDao;






public class Fluxo {
	private static Scanner scanner;
	
	public void cadastrarCaixa() throws IOException{
		scanner = new Scanner(System.in);
		CaixaDao arquivo = new CaixaDao();
		System.out.println("\nInsira a venda: \n");
		String vendas = scanner.next();
		System.out.println("\nInsira quando foi recebido na venda: \n");
		float recebimento = scanner.nextFloat();
		System.out.println("\nInsira pagamentos: \n");
		float pagamentos = scanner.nextFloat();
		System.out.println("\nInsira despesas: \n");
		float despesas = scanner.nextFloat();
		Caixa p = new Caixa(vendas,recebimento,pagamentos,despesas);
		arquivo.addCaixa(p);
		System.out.println("\nNova venda adcionada\n");
	}
	
	public void AlterarCaixa() throws IOException{
		CaixaDao arquivo = new CaixaDao();
		Fluxo almoxarifado = new Fluxo();
		scanner = new Scanner(System.in);
		almoxarifado.ListarCaixa();
		System.out.println("Digite qual venda voce deseja editar:");
		String venda = scanner.next();
		Caixa p = new Caixa(venda,0,0,0);
		arquivo.updateCaixa(p);
		
	}
	
	public void ListarCaixa() throws IOException{
		CaixaDao arquivo = new CaixaDao();
		ArrayList<Caixa> caixa = arquivo.PesquisaCaixa(new Caixa("",0,0,0));
	
		System.out.println("Lista de Produto:");
		System.out.println("---------------------------------------------------------------------------");
		for (Caixa caixas:caixa) {
			System.out.println("Vendas: "+caixas.getVendas());
			System.out.println("Pagamentos: "+caixas.getPagamentos());
			System.out.println("Recebimentos: "+caixas.getRecebimento());
			System.out.println("Despesas: "+caixas.getDespesas());
			System.out.println("---------------------------------------------------------------------------");
			}	
	}
	
	public void RemoveProduto() throws IOException{
		CaixaDao arquivo = new CaixaDao();
		Fluxo almoxarifado = new Fluxo();
		scanner = new Scanner(System.in);
		almoxarifado.ListarCaixa();
		System.out.println("Digite qual venda voce deseja excluir:");
		String venda = scanner.next();
		Caixa p = new Caixa(venda,0,0,0);
		arquivo.removeCaixa(p);
		
	}
	
	public void imprimirOpçoes(){
		System.out.println("\nEscolha uma das opiçoes: \n");
		System.out.println("1 - Listar caixa. \n");
		System.out.println("2 - Cadastrar caixa. \n");
		System.out.println("3 - Alterar Caixa. \n");
		System.out.println("3 - Excluir Caixa. \n");
		System.out.println("5 - sair. \n");
	}
	public boolean Login(){
		scanner = new Scanner(System.in);
		userDao dao = new userDao();
		System.out.println("\nInsira login: \n");
		String nome = scanner.next();
		System.out.println("\nInsira senha: \n");
		String senha = scanner.next();
		ArrayList<User> found = dao.PesquisarUser(new User(nome, senha));
		for (User u : found) {
			if(u.getNome().equals(nome)){
				if(u.getSenha().equals(senha)){
					return true;
				}
			}
		}
		return false;
	}

}
