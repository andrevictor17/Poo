package br.com.fatec;

public class UsuarioJaExiste extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6848411379374403798L;
	public UsuarioJaExiste(String message) {
        super(message + " = Usu�rio j� cadastrado!");
    }
}
