package br.com.fatec.engine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Professor;



public class Arquivo {
	
	public void addAluno(Aluno p ) throws IOException {
		File objectData = new File("database/Aluno/"+ p.getNome() +".txt");
		if(!objectData.createNewFile()){
			String Nome = p.getNome();
			int i = 0;
			p.setNome(Nome + String.valueOf(i));
			objectData = new File("database/Aluno/"+ p.getNome() +".txt");
			while(!objectData.createNewFile()){
				i = i + 1;
				p.setNome(Nome + String.valueOf(i));
				objectData = new File("database/Aluno/"+ p.getNome() +".txt");
			}
		}
		FileWriter fw = new FileWriter(objectData.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(p.getNome() + System.lineSeparator());
		bw.write(p.getTelefone() + System.lineSeparator());
		bw.write(p.getEmail() + System.lineSeparator());
		bw.write(p.getNumeroMatricula() + System.lineSeparator());
		bw.close();
	}
	
	public void addProfessor(Professor p ) throws IOException {
		File objectData = new File("database/Professor/"+ p.getNome() +".txt");
		if(!objectData.createNewFile()){
			String Nome = p.getNome();
			int i = 0;
			p.setNome(Nome + String.valueOf(i));
			objectData = new File("database/Professor/"+ p.getNome() +".txt");
			while(!objectData.createNewFile()){
				i = i + 1;
				p.setNome(Nome + String.valueOf(i));
				objectData = new File("database/Professor/"+ p.getNome() +".txt");
			}
		}
		FileWriter fw = new FileWriter(objectData.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(p.getNome() + System.lineSeparator());
		bw.write(p.getTelefone() + System.lineSeparator());
		bw.write(p.getEmail() + System.lineSeparator());
		bw.write(p.getNumeroRegistro() + System.lineSeparator());
		bw.write(p.getQuantidadeHoraAula() + System.lineSeparator());
		bw.close();
	}

	/**
	 * @param p
	 * @return boolean
	 */
	public boolean removeAluno(Aluno p) {
		File objectData = new File("database/Aluno/"+ p.getNome() +".txt");
		if(!objectData.delete()){
			return false;
		}
		return true;
	}
	
	public boolean removeProfessor(Professor p) {
		File objectData = new File("database/Professor/"+ p.getNome() +".txt");
		if(!objectData.delete()){
			return false;
		}
		return true;
	}

	
	/**
	 * @param pold  
	 * @param pnew
	 * @return boolean
	 * @throws IOException 
	 */
	public boolean updateAluno(Aluno p){
		Agenda agenda = new Agenda();
		File objectData = new File("database/Aluno/"+ p.getNome() +".txt");
		if(!objectData.exists()){
			return false;
		}
		try{
			objectData.delete();
			agenda.cadastrarAluno();
			
			return true;
		}
		catch(IOException e){
			e.printStackTrace();
			try {
				agenda.cadastrarAluno();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return false;
		}
	}
	
	public boolean updateProfessor(Professor p){
		Agenda agenda = new Agenda();
		File objectData = new File("database/Professor/"+ p.getNome() +".txt");
		if(!objectData.exists()){
			return false;
		}
		try{
			objectData.delete();
			agenda.cadastrarProfessor();
			return true;
		}
		catch(IOException e){
			e.printStackTrace();
			try {
				agenda.cadastrarProfessor();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return false;
		}
	}

	/**
	 * @param alunos  
	 * @return array
	 * @throws IOException 
	 */
	
	public ArrayList<Aluno> PesquisaAluno(Aluno alunos) {
		File objectData = new File("database/Aluno/");
		File[] allObjects = objectData.listFiles();
		ArrayList<Aluno> result = new ArrayList<Aluno>();
		for (int i = 0; i < allObjects.length; i++) {
			if(allObjects[i].getName().contains(alunos.getNome())){
				result.add(LerAluno(allObjects[i].getName()));
			}
		}
		return result;
	}
	
	
	public Aluno LerAluno(String ArquivoNome){
		String nome ;
		String telefone ;
		String email ;
		String numeroMatricula;
		BufferedReader br;
		
		try{
			FileReader objectData = new FileReader("database/Aluno/"+ ArquivoNome);
			br = new BufferedReader(objectData);
			nome = br.readLine();
			telefone = br.readLine();
			email = br.readLine();
			numeroMatricula = br.readLine();
			br.close();
		}
		catch(FileNotFoundException e1){
			return new Aluno("","","","");
		}
		catch(IOException e2){
			return new Aluno("","","","");
		}
		return new Aluno(nome,telefone,email,numeroMatricula);
	}
	
	public ArrayList<Professor> PesquisaProfessor(Professor p ) {
		File objectData = new File("database/Professor/");
		File[] allObjects = objectData.listFiles();
		ArrayList<Professor> result = new ArrayList<Professor>();
		for (int i = 0; i < allObjects.length; i++) {
			if(allObjects[i].getName().contains(p.getNome())){
				result.add(LerProfessor(allObjects[i].getName()));
			}
		}
		return result;
	}
	
	
	
	public Professor LerProfessor(String ArquivoNome){
		String nome;
		String telefone;
		String email;
		String reg;
		String quantHora;
		BufferedReader br;
		
		try{
			FileReader objectData = new FileReader("database/Professor/"+ ArquivoNome);
			br = new BufferedReader(objectData);
			nome = br.readLine();
			telefone = br.readLine();
			email = br.readLine();
			reg = br.readLine();
			quantHora = br.readLine();
			
			br.close();
		}
		catch(FileNotFoundException e1){
			return new Professor("","","","","");
		}
		catch(IOException e2){
			return new Professor("","","","","");
		}
		return new Professor(nome,telefone,email,reg,quantHora);
	}
	

}
