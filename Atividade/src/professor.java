
public class professor extends pessoa{
	public int numeroMatricula;
	public String[] turmas;
	
	public professor(String nome, int numeroMatricula){
		super(nome);
		this.numeroMatricula = numeroMatricula;
	}
	
	public void setDisciplinas(String[] turmas){
		this.turmas = turmas;
	}
}
