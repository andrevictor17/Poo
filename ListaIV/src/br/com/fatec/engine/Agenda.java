package br.com.fatec.engine;

import java.util.ArrayList;
import java.util.List;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Professor;

public class Agenda {
	private List<Aluno> alunos;
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void AddAluno(String Nome,String telefone,String Email,String numeroMatricula) {
		List<Aluno> ListaAluno = new ArrayList<Aluno>();
		Aluno x = new Aluno(Nome,telefone,Email,numeroMatricula);
		ListaAluno.add(x);
		this.alunos = ListaAluno;
		
	}
	
	public void AddProfessor(String Nome,String telefone,String Email,String Reg,String quantHora) {
		List<Professor> ListaProf = new ArrayList<Professor>();
		Professor y = new Professor(Nome,telefone,Email,Reg,quantHora);
		ListaProf.add(y);
		this.professores = ListaProf;
		
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	private List<Professor> professores;
	
	public static void main(String arg[]) {
		Agenda agenda =new Agenda();
		
		
		agenda.AddAluno("andre","123912","andre@gmail","matricula");
		agenda.AddProfessor("gerson","666","andre@gmail","registro","horas");
		agenda.ListarTodos();
	
	
		 
		
	}
	
	public void ListarTodos() {
		System.out.println("Lista de contatos de alunos: ");
		for (Aluno aluno:alunos) {
			System.out.println("Nome :"+aluno.getNome());
			System.out.println("Telefone: "+aluno.getTelefone());
			System.out.println("Email: "+aluno.getEmail());
			System.out.println("Nº Matricula: "+aluno.getNumeroMatricula()+"/n");
		}
	System.out.println("Lista de contatos de professores ");
	for (Professor professor:professores) {
		System.out.println("Nome: "+professor.getNome());
		System.out.println("Telefone "+professor.getTelefone());
		System.out.println("Email: "+professor.getEmail());
		System.out.println("Registro: "+professor.getNumeroRegistro());
		System.out.println("Quantidade Hora: "+professor.getQuantidadeHoraAula());	
		}
	}
}
