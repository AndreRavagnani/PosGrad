
public class TesteEstudante {
public static void main(String[] args) {
	Estudante e = new Estudante(1120555,"André",'M');
	e.atribuirNota(1, 7.0);
	e.atribuirNota(2, 8.0);
	e.atribuirNota(3, 6.0);
	e.atribuirNota(4, 9.0);
	
	double nota = e.lerNota(3);
	
	System.out.println(nota);
	
	e.exibir();
	
}
}
