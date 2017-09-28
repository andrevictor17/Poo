package br.com.fatec.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Professor;

public class Agenda {
	private ArrayList<Aluno> alunos;
	private List<Professor> professores;
	private Scanner scanner;
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
	public void cadastrarAluno() throws IOException{
		scanner = new Scanner(System.in);
		Arquivo arquivo = new Arquivo();
		System.out.println("\nInsira um nome para o aluno: \n");
		String nome = scanner.next();
		System.out.println("\nInsira um telefone para o aluno: \n");
		String telefone = scanner.next();
		System.out.println("\nInsira um email para o aluno: \n");
		String email = scanner.next();
		System.out.println("\nInsira a matricula para o aluno: \n");
		String matricula = scanner.next();
		Aluno p = new Aluno(nome, telefone, email, matricula);
		arquivo.addAluno(p);
		System.out.println("\nNovo Aluno adicionado\n");
	}
	
	public void cadastrarProfessor() throws IOException{
		scanner = new Scanner(System.in);
		Arquivo arquivo = new Arquivo();
		System.out.println("\nInsira um nome para  o professor: \n");
		String nome = scanner.next();
		System.out.println("\nInsira um telefone para o professor: \n");
		String telefone = scanner.next();
		System.out.println("\nInsira um email para o professor: \n");
		String email = scanner.next();
		System.out.println("\nInsira um Registro para o professor: \n");
		String reg = scanner.next();
		System.out.println("\nInsira um quantidade de horas trabalhadas para o professor: \n");
		String quantHora = scanner.next();
		Professor p = new Professor(nome,telefone,email,reg,quantHora);
		arquivo.addProfessor(p);
		System.out.println("\nNovo Professor adicionado\n");
	}
	
	public void imprimirOpçoes(){
		System.out.println("\nEscolha uma das opiçoes: \n");
		System.out.println("1 - Listar contatos. \n");
		System.out.println("2 - Incluir Aluno. \n");
		System.out.println("3 - Incluir Professor.\n");
		System.out.println("4 - Alterar Aluno. \n");
		System.out.println("5 - Alterar Professor.\n");
		System.out.println("6 - Excluir Aluno. \n");
		System.out.println("7 - Ecluir Professor.\n");
		System.out.println("8 - sair. \n");
	}
	public void AlterarAluno() throws IOException{
		Arquivo arquivo = new Arquivo();
		Agenda agenda = new Agenda();
		scanner = new Scanner(System.in);
		agenda.ListarAluno();
		System.out.println("Digite o nome de qual Aluno voce deseja editar:");
		String nome = scanner.next();
		Aluno p = new Aluno(nome," "," "," ");
		arquivo.updateAluno(p);
		
	}
	public void AlterarProfessor() throws IOException{
		Arquivo arquivo = new Arquivo();
		Agenda agenda = new Agenda();
		scanner = new Scanner(System.in);
		agenda.ListarProfessor();
		System.out.println("Digite o nome de qual professor voce deseja editar:");
		String nome = scanner.next();
		Aluno p = new Aluno(nome," "," "," ");
		arquivo.updateAluno(p);
		
	}
	
	public void RemoveAluno() throws IOException{
		Arquivo arquivo = new Arquivo();
		Agenda agenda = new Agenda();
		scanner = new Scanner(System.in);
		agenda.ListarAluno();
		System.out.println("Digite o nome de qual aluno voce deseja Deletar:");
		String nome = scanner.next();
		Aluno p = new Aluno(nome," "," "," ");
		arquivo.removeAluno(p);
		
	}
	public void RemoveProfessor() throws IOException{
		Arquivo arquivo = new Arquivo();
		Agenda agenda = new Agenda();
		scanner = new Scanner(System.in);
		agenda.ListarProfessor();
		System.out.println("Digite o nome de qual Professor voce deseja Deletar:");
		String nome = scanner.next();
		Professor p = new Professor(nome," "," "," "," ");
		arquivo.removeProfessor(p);
		
	}
	public void ListarAluno() throws IOException{
		Arquivo arquivo = new Arquivo();
		ArrayList<Aluno> alunos = arquivo.PesquisaAluno(new Aluno("","","",""));
		ArrayList<Professor> professores = arquivo.PesquisaProfessor(new Professor("","","","",""));
		
		System.out.println("Lista de contatos de alunos: ");
		System.out.println("---------------------------------------------------------------------------");
		for (Aluno aluno:alunos) {
			System.out.println("Nome :"+aluno.getNome());
			System.out.println("Telefone: "+aluno.getTelefone());
			System.out.println("Email: "+aluno.getEmail());
			System.out.println("Nº Matricula: "+aluno.getNumeroMatricula()+"/n");
			System.out.println("----------------------------------------------------------------------------");
		}
		
	}
	
	public void ListarProfessor() throws IOException{
		Arquivo arquivo = new Arquivo();
		ArrayList<Aluno> alunos = arquivo.PesquisaAluno(new Aluno("","","",""));
		ArrayList<Professor> professores = arquivo.PesquisaProfessor(new Professor("","","","",""));
		
		
		System.out.println("Lista de contatos de professores:");
		System.out.println("---------------------------------------------------------------------------");
		for (Professor professor:professores) {
			System.out.println("Nome: "+professor.getNome());
			System.out.println("Telefone "+professor.getTelefone());
			System.out.println("Email: "+professor.getEmail());
			System.out.println("Registro: "+professor.getNumeroRegistro());
			System.out.println("Quantidade Hora: "+professor.getQuantidadeHoraAula());
			System.out.println("---------------------------------------------------------------------------");
			}
		
		
		
		
		
	}
	
		
	
}
