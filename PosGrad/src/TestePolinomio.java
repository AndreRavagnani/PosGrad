
public class TestePolinomio {

	public static void main(String[] args) {
		Polinomio p = new Polinomio(new double[] {5,4,-3,2,1,5});
		p.imprimir();
		System.out.println();
		Polinomio e = p.derivada();
		e.imprimir();
	}
}
