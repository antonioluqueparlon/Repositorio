package operar_arrays;


public class Array {
	 
	public static void rellena_array() {
		int array[]= new int [10];
		//Inicializamos los valores del array y declaramos que sean numeros al azar
		for(int i=0; i<array.length; i++) {
		array[i]=Utils.obtenerNumeroAzar(1,100);
		}
	}

	public static void main(String[] args) {
		
		rellena_array();
	
	
	}
}

