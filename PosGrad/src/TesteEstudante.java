
public class TesteEstudante {
public static void main(String[] args) {
	Estudante e = new Estudante(1120555,"Andr�",Estudante.TipoSexo.Masculino);
	e.atribuirNota(Estudante.TipoNota.VP1, 7.0);
	e.atribuirNota(Estudante.TipoNota.VP2, 8.0);
	e.atribuirNota(Estudante.TipoNota.VP3, 6.0);
	e.atribuirNota(Estudante.TipoNota.VP4, 9.0);
	
	double nota = e.lerNota(Estudante.TipoNota.VP2);
	
	System.out.println(nota);
	
	e.exibir();
	
}
}
