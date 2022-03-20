
package ed.carolina;
/**
 * Clase que permite realizar operaciones matemáticas.
 * 
 * <p>
 * La clase calculadora permite realizar una serie de operaciones pasando los operandos como
 * parámetros y devolviendo el resultado de dicha operación que tendremos que guardar en 
 * una variable para su posterior uso.
 * Las operaciones disponibles son: suma, resta, multiplica y divide.
 * </p>
 * 
 * @author Carolina Torregrosa Nadal
 * @version 2.5 (Versión actual de la clase)
 * @since 1.9 Junio 2019 (Versión desde la cual está disponible esta clase)
 */
public class Calculadora {
	
	
	/**
	 * Suma dos operandos enteros y devuelve un entero con el resultado de la suma. Se permite
	 * el uso de enteros negativos o positivos.
	 * 
	 * @param a Primer sumando.
	 * @param b Segundo sumando.
	 * @return Resultado de la suma de a y b
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Resta dos operandos enteros y devuelve un entero con el resultado de la resta,
	 * pudiendo ser un resultado negativo o positivo.
	 * 
	 * @param a Primer número de la resta (minuendo).
	 * @param b Segundo número de la rest (sustraendo).
	 * @return Resultado de la resta de a-b (diferencia).
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplica dos operandos enteros y devuelve un entero con el resultado de la operación,
	 * pudiendo ser todos los números tanto positivos como negativos.
	 * 
	 * @param a Primer factor a multiplicar.
	 * @param b Segundo factor a multiplicar.
	 * @return Producto de a y b.
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Divide un entero entre otro, devolviendo otro entero y descartando los decimales o el
	 * resto de dicha operación. En el caso de que la división sea entre 0, se lanzará una
	 * excepción de tipo ArithmeticException.
	 * 
	 * @param a Primer número a dividir o dividendo
	 * @param b Segundo número entre el que se divide o divisor
	 * @return Cociente de a entre b
	 * @throws ArithmeticException Se obtiene cuando el divisor es 0.
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	public int oper1 ( int a , int n ){

	    int t = 1;

	    for ( int i = 0; i < n ; i++ ){
	        t = t * a;
	    }

	    return t; 

	}

	public boolean oper2 ( int a ){

	    boolean r;

	    if ( a % 2 == 0) {
	        r = true;
	    } else {
	        r = false;
	    }

	    return r;

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

	}
	
}
