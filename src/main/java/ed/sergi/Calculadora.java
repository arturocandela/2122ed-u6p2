package ed.sergi;

/**
 * Fa càlcus amb els paràmetres rebuts
 * <p>
 * Aquesta classe actua com a calculadora i permet retornar el
 *  resultat dels paràmetres rebuts a diversos tipus de càlculs
 * </p>
 * @author Sergi Payà
 * @version 2.5
 * @since 1.9, juny de 2019
 *
 */
/**
 * @author sergi
 *
 */
public class Calculadora {
	
	/**
	 * 
	 * Reb 2 paràmetres i els suma
	 * @param a primer sumand
	 * @param b segon sumand
	 * @return Retorna la suma de a i b
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Reb 2 parametres i els resta
	 * @param a valor inicial
	 * @param b valor a restar
	 * @return Retorna la resta de a - b
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Reb 2 parametres i els multiplica
	 * @param a multiplicand
	 * @param b multiplicador
	 * @return Retorna la multiplicacio de a * b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Reb dos parametres y els divideix
	 * @param a dividend
	 * @param b divisor
	 * @return Retorna el resultat de a / b
	 * @exception ArithmeticException Si el divisor es 0 no es podra fer la divisio
	 */
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
