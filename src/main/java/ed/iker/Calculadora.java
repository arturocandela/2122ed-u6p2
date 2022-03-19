package ed.iker;

/**
 * Esta clase serveix per a realitzar diferents calculs, com la suma, la resta,
 * la multiplicació i la divisio dels nombres passats per argument. Es requereixen 
 * nombres enters
 * @author iker
 * @version 2.5
 * @since 1.9, juny de 2019
 */

public class Calculadora {
	/**
	 * @param a primer enter
	 * @param b segon enter
	 * @return Retorna la suma dels dos numeros passats per argument
	 * @throws java.util.NoSuchElementException llança error si aquest no te elements passats per argument
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * @param a primer enter
	 * @param b segon enter
	 * @return Retorna la resta dels dos numeros passats per argument
	 * @throws java.util.NoSuchElementException llança error si aquest no te elements passats per argument
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * @param a primer enter
	 * @param b segon enter
	 * @return Retorna la multiplicacio dels dos numeros passats per argument
	 * @throws java.util.NoSuchElementException llança error si aquest no te elements passats per argument
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * @param a primer enter
	 * @param b segon enter
	 * @return Retorna la divisio dels dos numeros passats per argument
	 * @throws java.util.NoSuchElementException llança error si aquest no te elements passats per argument
	 * @throws ArithmeticException si el numero és dividit entre 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/**
	 * Multiplica el numero de vegades que li pases per argument,
	 * el numero pasat per argument
	 * @param numero numero que va a multiplicarse
	 * @param numeroVegades numero vegades
	 * @throws java.util.NoSuchElementException llança error si aquest no 
	 * te elements passats per argument
	 * @return numero multiplicat per numeroVegades
	 */
	public int multiplicador ( int numero , int numeroVegades ){

	    int t = 1;

	    for ( int i = 0; i < numeroVegades ; i++ ){
	        t = t * numero;
	    }

	    return t; 

	}
	/**
	 * Este metodo calcula mediante una division simple si el numero es par
	 * @param numero entero
	 * @throws java.util.NoSuchElementException llança error si aquest no 
	 * te elements passats per argument
	 * @return true si el numero es par o false si el numero no es par
	 */

	public boolean esPar ( int numero ){

	    boolean isPar;

	    if ( numero % 2 == 0) {
	        isPar = true;
	    } else {
	        isPar = false;
	    }

	    return isPar;

	}

	/**
	 * Aquest metode relitza una factoritzacio de el numero passat com a parametre. 
	 * Ex numero = 5, returns 101
	 * @param numero entero
	 * @return Retorna la unio dels numeros de la seua propia factorizacio, en formato String
	 * @throws java.util.NoSuchElementException llança error si aquest no 
	 * te elements passats per argument
	 */
	
	public String factoritzacioDeUnNumero(int numero){

	    String cadena = "";
	    int variable = numero;
	    int variable2;

	    while ( variable > 0) {

	        variable2 = variable % 2;

	        cadena = variable2 + cadena;

	        variable = variable / 2;


	    }
	    return cadena;
	}
	
}
