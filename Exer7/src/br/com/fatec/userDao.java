package br.com.fatec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class userDao {
	
	public userDao() {
	}

	/**
	 * @param u
	 * @throws IOException 
	 */
	public void addUser(User u ) throws UsuarioJaExiste, IOException{
		File objectData = new File("database/users/"+ u.getNome() +".txt");
		if(objectData.exists()){
			UsuarioJaExiste e = new UsuarioJaExiste(u.getNome());
			throw e;
		}
		FileWriter fw = new FileWriter(objectData.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(u.getNome() + System.lineSeparator());
		bw.write(u.getSenha() + System.lineSeparator());
		
		bw.close();
	}

	/**
	 * @param u
	 */
	public boolean removeUser(User u ) {
		File objectData = new File("database/users/"+ u.getNome() +".txt");
		if(!objectData.delete()){
			return false;
		}
		return true;
	}

	/**
	 * @param old  
	 * @param new
	 */
	public boolean updateUser(User old , User u  ) {
		File objectData = new File("database/users/"+ old.getNome() +".txt");
		if(!objectData.exists()){
			return false;
		}
		try{
			objectData.delete();
			objectData = new File("database/users/"+ u.getNome() +".txt");
			objectData.createNewFile();
			return true;
		}
		catch(IOException e){
			e.printStackTrace();
			objectData = new File("database/users/"+ old.getNome() +".txt");
			try {
				objectData.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return false;
		}
	}

	/**
	 * @param u  
	 * @return
	 */
	public ArrayList<User> PesquisarUser(User u ) {
		File objectData = new File("database/users/");
		File[] allObjects = objectData.listFiles();
		ArrayList<User> result = new ArrayList<User>();
		for (int i = 0; i < allObjects.length; i++) {
			if(allObjects[i].getName().contains(u.getNome())){
				result.add(readUser(allObjects[i].getName()));
			}
		}
		return result;
	}
	
	public User readUser(String fileNome){
		String Nome = null, senha = null;
		BufferedReader br;
		try{
			FileReader objectData = new FileReader("database/users/"+ fileNome);
			br = new BufferedReader(objectData);
			Nome = br.readLine();
			senha = br.readLine();
			br.close();
		}
		catch(FileNotFoundException e1){
			e1.printStackTrace();
			return null;
		}
		catch(IOException e2){
			e2.printStackTrace();
			return null;
		}
		return new User(Nome, senha);
	}

}
