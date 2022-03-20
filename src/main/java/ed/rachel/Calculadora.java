package ed.rachel;

/**
 * Clase Calculadora. Se utilizan metodos para realizar operaciones.
 * 
 * Mediante dos atricutos de tipo entero se realizan cuatro tipos de operaciones, suma, resta, multiplicacion y division.
 * 
 * 
 * @author Rachel Samaniego Gisbert
 * @version 2.5
 * @since version 1.9 of june 2019
 * 
 * */

public class Calculadora {
	/**
	 * Se suma dos enteros
	 * @param a, entero
	 * @param b, entero
	 * @return suma de a y b, entero
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * Se resta dos enteros
	 * @param a, entero
	 * @param b, entero
	 * @return resta de a y b, entero, puede ser un numero negativo
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Se multiplica dos enteros
	 * @param a, entero
	 * @param b, entero
	 * @return multiplicacion de a y b, entero
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * Se divide dos enteros
	 * @param a, entero
	 * @param b, entero
	 * @return division de a y b, entero
	 * @exception ArithmeticException Cuando se intenta dividir entre 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
