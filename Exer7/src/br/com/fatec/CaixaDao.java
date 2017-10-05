package br.com.fatec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import engine.Fluxo;

public class CaixaDao {
	public void addCaixa(Caixa p ) throws IOException {
		File objectData = new File("database/Caixa/"+ p.getVendas() +".txt");
		if(!objectData.createNewFile()){
			String Nome = p.getVendas();
			int i = 0;
			p.setVendas(Nome + String.valueOf(i));
			objectData = new File("database/Caixa/"+ p.getVendas() +".txt");
			while(!objectData.createNewFile()){
				i = i + 1;
				p.setVendas(Nome + String.valueOf(i));
				objectData = new File("database/Caixa/"+ p.getVendas() +".txt");
			}
		}
		FileWriter fw = new FileWriter(objectData.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(p.getVendas() + System.lineSeparator());
		bw.write(p.getRecebimento() + System.lineSeparator());
		bw.write(p.getPagamentos() + System.lineSeparator());
		bw.write(p.getDespesas() + System.lineSeparator());
		
		
		bw.close();
	}
	
	
	
	public boolean removeCaixa(Caixa p) {
		File objectData = new File("database/Caixa/"+ p.getVendas() +".txt");
		if(!objectData.delete()){
			return false;
		}
		return true;
	}
	

	
	public boolean updateCaixa(Caixa p){
		Fluxo fluxo = new Fluxo();
		File objectData = new File("database/Caixa/"+ p.getVendas() +".txt");
		if(!objectData.exists()){
			return false;
		}
		try{
			objectData.delete();
			fluxo.cadastrarCaixa();
			return true;
		}
		catch(IOException e){
			e.printStackTrace();
			try {
				fluxo.cadastrarCaixa();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return false;
		}
	}
	
	public ArrayList<Caixa> PesquisaCaixa(Caixa Caixas ) {
		File objectData = new File("database/Caixa/");
		File[] allObjects = objectData.listFiles();
		ArrayList<Caixa> result = new ArrayList<Caixa>();
		for (int i = 0; i < allObjects.length; i++) {
			if(allObjects[i].getName().contains(Caixas.getVendas())){
				result.add(LerCaixa(allObjects[i].getName()));
			}
		}
		return result;
	}
		
	public Caixa LerCaixa(String ArquivoNome){
		String vendas;
		float recebimento,pagamentos,despesas;
		
		BufferedReader br;
		
		try{
			FileReader objectData = new FileReader("database/Caixa/"+ ArquivoNome);
			br = new BufferedReader(objectData);
			vendas = br.readLine();
			recebimento = Float.parseFloat(br.readLine());
			pagamentos = Float.parseFloat(br.readLine());
			despesas = Float.parseFloat(br.readLine());
			
			
			br.close();
		}
		catch(FileNotFoundException e1){
			return new Caixa("",0,0,0);
		}
		catch(IOException e2){
			return new Caixa("",0,0,0);
		}
		return new Caixa(vendas,recebimento,pagamentos,despesas);
	}
}
