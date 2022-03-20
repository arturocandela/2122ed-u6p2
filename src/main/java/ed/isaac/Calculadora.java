package ed.isaac;

/**
 * Clase para realización de distintas operaciones con enteros pasados como argumentos.
 * <p>La clase calculadora tiene la finalidad de reaalizar los ejercicios planteados en la práctica 2 para trabajar un poco con la documentación del código de java. Sus principales métodos son para sumar, restar, multiplicar y dividir diferentes enteros que pasaremos como argumento al llamar al método.</p>
 * @author isaac
 * @version 2.5
 * @version disponible desde la 1.9
 */

public class Calculadora {
	
	/**
	 * Realizar una suma con los parametros pasados como argumento
	 * @param a operando1
	 * @param b operando2
	 * @return El resultado de la suma de a + b
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * Realizar una resta con los parametros pasados como argumento
	 * @param a operando1
	 * @param b operando2
	 * @return El resultado de la resta de a - b
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Realizar una multiplicación con los parametros pasados como argumento
	 * @param a operando1
	 * @param b operando2
	 * @return El resultado de la multiplicación de a * b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * Realizar una division con los parametros pasados como argumento
	 * @param a operando1
	 * @param b operando2
	 * @return El resultado de la division de a / b
	 * @exception al intentar dividir un número por 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
