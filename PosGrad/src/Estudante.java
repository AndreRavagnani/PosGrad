
public class Estudante {
	int matricula;
	String nome;
	char sexo;
	double[] notas = new double[4];

	public Estudante(){}
	public Estudante(int matricula, String nome, char sexo){
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public void exibir(){
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Nome: " + this.nome);
		System.out.println("Sexo: " + this.sexo);
		int i = 1;
		for(double nota : notas){
			System.out.println("Nota " +i+ ": " + nota);
			i++;
		}
	}
	
	public void atribuirNota(int numProva, double nota){
		this.notas[numProva-1] = nota;
	}
	
	public double lerNota(int numProva){
		return this.notas[numProva-1];
	}

}
