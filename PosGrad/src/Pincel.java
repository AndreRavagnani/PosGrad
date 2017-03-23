
public class Pincel {
	String cor;
	String forma;
	int tamanho;
	int capacidade;

	public Pincel(){
		this("Rosa", "Cilindrico", 0,0);
	}

	public Pincel(String cor, String forma, int tamanho, int capacidade){
		this.cor = cor;
		this.forma = forma;
		this.tamanho = tamanho;
		this.capacidade = capacidade;
	}

	public void riscar(String mensagem){
		System.out.println("Riscando de cor " + this.cor + " a mensagem " + mensagem);
	}

	public void riscar(){
		System.out.println("-------");	
	}

}
