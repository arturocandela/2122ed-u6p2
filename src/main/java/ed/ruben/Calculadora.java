package ed.ruben;

/**
 * Clase Calculatora, capaz de realizar operaciones simples con dos enteros.
 * <p>
 * La clase calculadora es capaz de realizar operaciones matemáticas simples teniendo
 * como parámetro de entrada dos numeros enteros, y devolviendo otro entero con el resultado
 * de la operación.
 * </p>
 * @author rubencatalan
 * @version 2.5
 * @since 1.9 (Juny, 2019)
 * 
 */

public class Calculadora {
	
	/**
	 * Éste método suma dos números enteros pasados como parámetro, y devuelve el resultado como 
	 * una variable de tipo entero
	 * @param a (int) Valor numerico del primer operando (a) para la operación a + b
	 * @param b (int) Valor numerico del segundo operando (b) para la operación a + b
	 * @return (int) El resultado de la operación a + b
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Éste método resta dos números enteros pasados como parámetro, y devuelve el resultado como 
	 * una variable de tipo entero
	 * @param a (int) Valor numerico del primer operando (a) para la operación a - b
	 * @param b (int) Valor numerico del segundo operando (b) para la operación a - b
	 * @return (int) El resultado de la operación a + b
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Éste método multiplica dos números enteros pasados como parámetro, y devuelve el resultado como 
	 * una variable de tipo entero
	 * @param a (int) Valor numerico del primer operando (a) para la operación a * b
	 * @param b (int) Valor numerico del segundo operando (b) para la operación a * b
	 * @return (int) El resultado de la operación a * b
	 */
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Éste método divide dos números enteros pasados como parámetro, y devuelve el resultado como 
	 * una variable de tipo entero
	 * @param a (int) Valor numerico del primer operando (a) para la operación a / b
	 * @param b (int) Valor numerico del segundo operando (b) para la operación a / b
	 * @return (int) El resultado de la operación a / b
	 * @throws java.lang.ArithmeticException cuando intentas dividir 0/0
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
