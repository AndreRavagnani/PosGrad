import java.util.Random;

public class Animal {

	static int contUrso;

	static int contPeixe;

	static enum TipoAnimal{Urso, Peixe};

	TipoAnimal tipo;
	
	static Random gerador = new Random();
	
	public Animal(TipoAnimal tipo){

		this.tipo = tipo;

		if(this.tipo == TipoAnimal.Peixe){
			contPeixe++;
		}
		else{
			contUrso++;
		}
	}
	
	public static void morrePeixe(){
		contPeixe--;
		System.out.println("Morreu mais um peixe. Quantidade de peixe atual: " + contPeixe);
	}
	
	public static  void nasceAnimal(TipoAnimal tipo, Animal[] rio){
	
		boolean criado = false;
		
		while(!criado){
			int ordem = gerador.nextInt(rio.length-1);
			if(rio[ordem] == null){
				rio[ordem] = new Animal(tipo);
				criado = true;
				System.out.println("Animal do Tipo " + tipo + " criado com sucesso.");
			}
		}
	}
	
	public static void inicio(int qntAnimais, Animal[] rio){
		
		for(int i = 0; i < qntAnimais;i++){
			nasceAnimal(TipoAnimal.Peixe, rio);
			nasceAnimal(TipoAnimal.Urso, rio);	
			}
		
		System.out.println("Criado os bixos base. Ursos:" + contUrso + " Peixes: "+ contPeixe);
		
		while(contPeixe > 0){
			System.out.println("Animais Andando");
			for(int i = 0; i <= rio.length-1;i++){
				if(contPeixe <= 0){
					break;
				}
				if(rio[i] != null && i+1 < rio.length){
					if( rio[i+1] == null){
						rio[i+1] = rio[i];
						rio[i] = null;
					}
					else if(rio[i].tipo == rio[i+1].tipo){
						nasceAnimal(rio[i].tipo, rio);
					}else{
						morrePeixe();
					}
				}
			}
		}
	
	}
	
	
}
