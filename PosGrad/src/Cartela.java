import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cartela {
	List<Integer> numeros = new ArrayList<Integer>();
	static int quantidade;
	int identificador;
	int numerosMarcados;

	public Cartela() {
		identificador = quantidade++;
		Random gerador = new Random();
		int numero;
		int count = 0;
		while (count < 15) {
			numero = gerador.nextInt(98);
			if (!numeros.contains(numero)) {
				numeros.add(numero);
				count++;
			}
		}
	}

	public void imprimir() {
		System.out.println("Identificador: " + identificador);
		System.out.println("Numeros: " + Arrays.toString(numeros.toArray()));

	}

	public boolean marcar(int numero) {
		if (numeros.contains(numero)) {
			numerosMarcados++;
		}
		if (numerosMarcados == 14) {
			return true;
		} else
			return false;
	}

}
