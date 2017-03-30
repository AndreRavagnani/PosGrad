import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Globo {
	List<Integer> numerosChamados = new ArrayList<Integer>();
	List<Cartela> contempladas = new ArrayList<Cartela>();
	List<Cartela> cartelas = new ArrayList<Cartela>();

	public Globo(int qntCartelas) {

		for (int i = 0; i < qntCartelas; i++) {
			cartelas.add(new Cartela());
		}
	}

	public void inicio() {
		boolean acabou = false;
		Random gerador = new Random();
		while (!acabou) {
			int numero = gerador.nextInt(98);
			if (!numerosChamados.contains(numero)) {
				numerosChamados.add(numero);
				for (Cartela c : cartelas) {
					boolean contemplada = c.marcar(numero);
					if (contemplada) {
						contempladas.add(c);
						acabou = true;
					}
				}
			}
		}
		imprimir();
	}

	public void imprimir() {
		System.out.println("Qnt de numeros chamados: " + numerosChamados.size());
		System.out.println("Numeros Chamados: " + Arrays.toString(numerosChamados.toArray()));
		System.out.println("Qnt Contempladas: " + contempladas.size());
		System.out.println();
		for (Cartela c : contempladas) {
			c.imprimir();
		}
	}

}
