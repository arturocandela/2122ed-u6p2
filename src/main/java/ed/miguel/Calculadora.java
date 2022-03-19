package ed.miguel;
/**
 * Clase para realizar operaciones matematicas
 */

/**
 * Clase con metodos aritméticos, para realizar operaciones matemáticas como:
 * sumar, restar, multiplicar y dividir.
 * 
 * 
 * @author Miguel Castro Juliá
 * @version 2.5
 * @since 1.9 desde junio del 2019
 *
 */

public class Calculadora {
	
	 /**
	 * 
	 * @param numero1 Primera variable int para realizar la suma
	 * @param numero2 Segunda variable int para realizar la suma
	 * @return El valor int de la suma de las dos variables
	 */
	public int suma(int numero1, int numero2) {
	
		return numero1 + numero2;
	}
	
	/**
		 * 
		 * @param numero1 Primera variable int para realizar la resta
		 * @param numero2 Segunda variable int para realizar la resta
		 * @return El valor int de la resta de las dos variables
		 */
	public int resta(int numero1, int numero2) { 
		
		return numero1 - numero2; 
	}
	
	/**
		 * 
		 * @param multiplicando Primera variable int para realizar la multiplicación
		 * @param multiplicador Segunda variable int para realizar la multiplicación
		 * @return El valor int de la multiplicación de las dos variables
		 */
	public int multiplica(int multiplicando, int multiplicador){ 
		
		return multiplicando*multiplicador; 
	}
	 
	/**
		 * 
		 * @param dividendo Primera variable int, es el dividendo para realizar la division
		 * @param divisor Segunda variable int  es el divisor para realizar la division
		 * @return El valor int de la division de las dos variables, y si por 
		 * algún caso diera el resultado decimales, solo mostrará el valor entero.
		 * 
		 */
	public int diveix(int dividendo, int divisor) {
			
		return dividendo/divisor;
		/**
		 * @throws AritmhmeticException by zero
		 * El divisor no puede ser cero
		 */
	}
	
	/**
	 * 
	 * @param base Entero para realizar la potencia
	 * @param exponente Entero con las veces que se multiplica la base
	 * @return retorna el resultado de la multiplicación de la base por si misma, tantas veces sea el exponente.
	 */
	
	public int potencia ( int base , int exponente ){


		 int resultadoPotencia = 1;

		 for ( int i = 0; i < exponente ; i++ ){
		       resultadoPotencia = resultadoPotencia * base;
	    }

		 return resultadoPotencia;

	}
	/**
	 * 
	 * @param numero variable int para saber si es par, al ser dividido por dos y su resto es cero.
	 * @return boleano: true, si es par y false, si no lo es
	 */

	public boolean esPar ( int numero ){

	    boolean resultado;

	    if ( numero % 2 == 0) {
	        resultado = true;
	    } else {
	        resultado = false;
	    }

	    return resultado;

	}
/**
 * 
 * @param numero Introducimos entero, para saber cual es en binario
 * @return nos retorna un String con los restos de las operaciones y así nos devuelve su binario.
 */
	public String enteroABinario(int numero){

	    String binario = "";
	    int resto;

	    while ( numero > 0) {

	        resto = numero % 2;

	        binario = resto + binario;

	        numero = numero / 2;

	    }
	    return binario;
	}
	
}
