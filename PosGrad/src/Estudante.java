import java.util.Arrays;

@SuppressWarnings("unused")
public class Estudante {

	static enum TipoNota { 
		VP1 , VP2 , VP3, VP4 
	}
	static enum TipoSexo {
		Feminino,Masculino
	}
	
	private int matricula;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoSexo getSexo() {
		return sexo;
	}
	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}	

	private String nome;
	private TipoSexo sexo;
	private double[] notas;

	public Estudante(){
		this(0,"",TipoSexo.Masculino);
	}
	public Estudante(int matricula, String nome, TipoSexo sexo){
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.notas = new double[4];
	}
	
	public void exibir(){
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Nome: " + this.nome);
		System.out.println("Sexo: " + this.sexo);
		int i = 1;
		for(double nota : notas){
			System.out.println("Nota " + i + ": " + nota);
			i++;
		}
		/*
		Outro meio para imprimir as notas
		System.out.println("Notas: " + Arrays.toString(notas));
		*/
	}
	
	public void atribuirNota(TipoNota numProva, double nota){
		this.notas[numProva.ordinal()] = nota;
	}
	
	public double lerNota(TipoNota numProva){
		return this.notas[numProva.ordinal()];
	}

}
