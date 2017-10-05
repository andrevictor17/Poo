package br.com.fatec;
/**
 *
 */
public class User {
	private String nome;
	private String senha;
	

	
	/**
	 * Default contrutor
	 */
	public User(String nome, String senha) {
		setNome(nome);
		setSenha(senha);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


}
