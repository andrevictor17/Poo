
public class Produto {
	private String nome;
	private int quant;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	
	public Produto(String nome,int quant){
		this.nome = nome;
		this.quant = quant;
		
	}
	
	public String dadosFormatados() {
		
		String dadosFormatados;
		dadosFormatados = dadosFormatados ="/n Nome: "+this.getNome();
		dadosFormatados = dadosFormatados ="/n Quantidade: "+this.getQuant();
		
		
		return dadosFormatados;
	}
}
