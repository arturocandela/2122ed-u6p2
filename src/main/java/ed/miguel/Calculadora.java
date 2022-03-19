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
	 * @param a Primera variable int para realizar la suma
	 * @param b Segunda variable int para realizar la suma
	 * @return El valor int de la suma de las dos variables
	 */
	public int suma(int a, int b) {
	
		return a + b;
	}
	
	/**
		 * 
		 * @param a Primera variable int para realizar la resta
		 * @param b Segunda variable int para realizar la resta
		 * @return El valor int de la resta de las dos variables
		 */
	public int resta(int a, int b) {
		
		return a - b;
	}
	
	/**
		 * 
		 * @param a Primera variable int para realizar la multiplicación
		 * @param b Segunda variable int para realizar la multiplicación
		 * @return El valor int de la multiplicación de las dos variables
		 */
	public int multiplica(int a, int b){
		
		return a*b;
	}
	
	/**
		 * 
		 * @param a Primera variable int, es el dividendo para realizar la division
		 * @param b Segunda variable int  es el divisor para realizar la division
		 * @return El valor int de la division de las dos variables, y si por 
		 * algún caso diera el resultado decimales, solo mostrará el valor entero.
		 * 
		 */
	public int diveix(int a, int b) {
			
		return a/b;
		/**
		 * @throws AritmhmeticException by zero
		 * El divisor no puede ser cero
		 */
	}
	
}
