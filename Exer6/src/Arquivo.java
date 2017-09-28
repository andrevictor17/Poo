import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Arquivo {
	

	public void addProduto(Produto p ) throws IOException {
		File objectData = new File("database/Produto/"+ p.getNome() +".txt");
		if(!objectData.createNewFile()){
			String Nome = p.getNome();
			int i = 0;
			p.setNome(Nome + String.valueOf(i));
			objectData = new File("database/Produto/"+ p.getNome() +".txt");
			while(!objectData.createNewFile()){
				i = i + 1;
				p.setNome(Nome + String.valueOf(i));
				objectData = new File("database/Produto/"+ p.getNome() +".txt");
			}
		}
		FileWriter fw = new FileWriter(objectData.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(p.getNome() + System.lineSeparator());
		bw.write(p.getQuant() + System.lineSeparator());
		
		bw.close();
	}
	
	
	
	public boolean removeProduto(Produto p) {
		File objectData = new File("database/Produto/"+ p.getNome() +".txt");
		if(!objectData.delete()){
			return false;
		}
		return true;
	}
	

	
	public boolean updateProduto(Produto p){
		Almoxarifado almoxarifado = new Almoxarifado();
		File objectData = new File("database/Produto/"+ p.getNome() +".txt");
		if(!objectData.exists()){
			return false;
		}
		try{
			objectData.delete();
			almoxarifado.cadastrarProduto();
			return true;
		}
		catch(IOException e){
			e.printStackTrace();
			try {
				almoxarifado.cadastrarProduto();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return false;
		}
	}
	
	public ArrayList<Produto> PesquisaProduto(Produto Produtos ) {
		File objectData = new File("database/Produto/");
		File[] allObjects = objectData.listFiles();
		ArrayList<Produto> result = new ArrayList<Produto>();
		for (int i = 0; i < allObjects.length; i++) {
			if(allObjects[i].getName().contains(Produtos.getNome())){
				result.add(LerProduto(allObjects[i].getName()));
			}
		}
		return result;
	}
		
	public Produto LerProduto(String ArquivoNome){
		String nome;
		int telefone;
		
		BufferedReader br;
		
		try{
			FileReader objectData = new FileReader("database/Produto/"+ ArquivoNome);
			br = new BufferedReader(objectData);
			nome = br.readLine();
			telefone = Integer.parseInt(br.readLine());
			
			
			br.close();
		}
		catch(FileNotFoundException e1){
			return new Produto("",0);
		}
		catch(IOException e2){
			return new Produto("",0);
		}
		return new Produto(nome,telefone);
	}
	
	
}
