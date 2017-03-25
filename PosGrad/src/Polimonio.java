
public class Polimonio {

	double[] numeros;

	public Polimonio(double[] numeros){
		this.numeros = numeros;
	}

	public void derivada(){

		double[] resultado = new double[numeros.length-1];
		System.out.print("P(x)= ");
		imprimir(this.numeros);

		for(int i = 0; i < numeros.length - 1 ; i++){

			resultado[i] = numeros[i] * (numeros.length - i - 1);

		}
		System.out.println();

		System.out.print("P(x)= ");
		imprimir(resultado);
	}

	public void imprimir(double[] numeros){	   
		for ( int i = 0; i < numeros.length; i++ ){	 
			System.out.print(numeros[i]);	
			if ( numeros.length - i > 1 ){
				if((numeros.length -1 - i) > 1)
					System.out.print("x^" + (numeros.length -1 - i) + " ");
				else{
					System.out.print("x");
				}

			}
			if( i + 1 < numeros.length &&  numeros[i + 1] > 0 )  System.out.print(" +");

		}
	}

}