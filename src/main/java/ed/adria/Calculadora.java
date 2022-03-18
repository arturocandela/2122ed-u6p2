package ed.adria;

/**
 * 
 * @author AdriaJ
 * @version 2.5
 * @since 1.2
 *This class groups various methods corresponding
 *a simple calculator
 *
 */
public class Calculadora {
	/**
	 * 
	 * @param a Integer of first number
	 * @param b Integer of second number
	 * @return a+b
	 * returns the sum of both numbers
	 * 
	 * This class returns the sum of both parameters
	 * 
	 * The methods of this calculator are the sum of two numbers,
	 * the extraction of two numbers, the multiplication of two numbers
	 * and the division of two numbers
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * 
	 *  @param a Integer of first number
	 * @param b Integer of second number
	 * @return a-b
	 * returns extraction of both numbers 
	 * entered as parameters
	 * Extracts the second parameter over the first
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * 
	 *  @param a Integer of first number
	 * @param b Integer of second number
	 * @return a*b return the multiplication of both parameters
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * 
	 *  @param a Integer of first number
	 * @param b Integer of second number
	 * @return a/b
	 * returns the division of the 
	 * first parameter over the second
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
