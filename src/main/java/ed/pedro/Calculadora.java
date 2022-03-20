package ed.pedro;
/**
 * Esta clase sirve para realizar cálculos matemáticos
 * 
 * La clase a continuación tiene como principal finalidad la realización de cálculos matemáticos de naturaleza simple, tales como suma, resta, 
 * multiplicación y división. Para el uso de los métodos és necesario proporcionar los parámetros de a y b, que vienen a representar los números
 * con los que queremos realizar la operación.
 * 
 * @author Pedro Luis Bruzual Puerta
 * @version 2.5
 * @since 1.9 july 2019
 * 
 */

public class Calculadora {

	
	public int suma(int a, int b) {
		/**
		 * Éste método devuelve la suma de a y b
		 * @param a sumando
		 * @param b sumando
		 * @return suma
		 */
		
		return a + b;
	}
	
	public int resta(int a, int b) {
		/**
		 * Éste método devuelve la resta de a y b
		 * @param a minuendo
		 * @param b sustraendo
		 * @return diferencia
		 */
		return a - b;
	}
	
	public int multiplica(int a, int b){
		/**
		 * Éste método devuelve la multiplicación de a por b
		 * 
		 * @param a multiplicando
		 * @param b multiplicador
		 * @return producto de a por b
		 *
		 */
		
		return a*b;
	}
	
	public int diveix(int a, int b) {
		/**
		 * Éste método devuelve la división de a entre b
		 * 
		 * @param a dividendo
		 * @param b divisor
		 * @return cociente de a entre b
		 * @exception throws ArithmeticException si b es 0 
		 */
		return a/b;
	}
	
}
