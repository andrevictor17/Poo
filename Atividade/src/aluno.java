
public class aluno extends pessoa {
	
	public int numeroMatricula;
	public String turma;
	public aluno(String nome, int numeroMatricula, String turma){
		super(nome);
		this.numeroMatricula = numeroMatricula;
		this.turma = turma;
	}

}
