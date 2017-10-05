package br.com.fatec;

public class Caixa {
	private String vendas;
	private float recebimento;
	private float pagamentos;
	private float despesas;
	
	public Caixa (String vendas, float recebimento, float pagamentos,float despesas) {
		this.vendas = vendas;
		this.recebimento = recebimento;
		this.pagamentos = pagamentos;
		this.despesas = despesas;
		
	}
	public String getVendas() {
		return vendas;
	}
	public void setVendas(String vendas) {
		this.vendas = vendas;
	}
	public float getRecebimento() {
		return recebimento;
	}
	public void setRecebimento(float recebimento) {
		this.recebimento = recebimento;
	}
	public float getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(float pagamentos) {
		this.pagamentos = pagamentos;
	}
	public float getDespesas() {
		return despesas;
	}
	public void setDespesas(float despesas) {
		this.despesas = despesas;
	}
	

}
