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
	/**
	 * Multiplica el número pasado como argumento por todos los números desde 1 hasta otro introducido
	 * @param a numero para multiplicar
	 * @param b limite hasta el que multiplicar
	 * @return el resultado de la suma de todas las multiplicaciones
	 */
	public int productoFactorial ( int a , int n ){

	    int t = 1;

	    for ( int i = 0; i < n ; i++ ){
	        t = t * a;
	    }

	    return t; 

	}
	/**
	 * Obtener si un número es par
	 * @param a numero a comprobar
	 * @return true si a es par y false sino
	 */
	public boolean esPar ( int a ){

	    boolean r;

	    if ( a % 2 == 0) {
	        r = true;
	    } else {
	        r = false;
	    }

	    return r;

	}
	/**
	 * divide el número entre 2 y guarda el resto en un String hasta que el número sea 0
	 * @param a numero a utilizar
	 * @return una cadena con el resto de las divisiones
	 */
	public String restoDivisiones (int a){

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
