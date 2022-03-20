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
	
	
	/**
	 * Realiza la operación matemática de elevar base a exponente.
	 * @param base de la operación base ^ exponente
	 * @param exponente de la operación base ^ exponente
	 * @return el resultado de la operación base ^ exponente
	 */
	public int elevar ( int base , int exponente ){

	    int resultado = 1;

	    for ( int i = 0; i < exponente ; i++ ){
	        resultado = resultado * base;
	    }

	    return resultado; 

	}

	/**
	 * Devuelve como resultado un booleano indicando si el numero introducido es par
	 * @param numero que se quiere saber si es par
	 * @return true si numero es par, false si numero es impar
	 */
	public boolean esPar ( int numero ){

	    boolean esPar;

	    if ( numero % 2 == 0) {
	        esPar = true;
	    } else {
	        esPar = false;
	    }

	    return esPar;

	}

	public String oper3(int a){

	    String r = "";
	    int v = a;
	    int v1;

	    while ( v > 0) {

	        v1 = v % 2;

	        r = v1 + r;

	        v = v / 2;


	    }
	    return r;

	}
	
}
