package ed.jose;

/**
 * Realiza diferentes operaciones con los números que se le pasen como parámetro
 * <p>
 * Esta clase parte de los requisitos de la actividad 2 de la práctica 2. En esta clase vemos diferentes operaciones que puede realizar una calculadora, nosotros le pasaremos los operandos como parametros y le diremos que operación queremos realizar. 
 * @author Jose Soriano Castro
 * @version 2.5
 * @since 1.9, Junio de 2019
 *
 */
public class Calculadora {
	
	/**
	 * Realiza una suma con los parametros entregados
	 * @param a Operando 1
	 * @param b Operando 2
	 * @return el resultado de la suma de los dos parametros
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Realiza una resta con los parametros entregados
	 * @param a Operando 1
	 * @param b Operando 2
	 * @return el resultado de la resta de los dos parametros 
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Realiza la multiplicación de los de parametros entregados
	 * @param a Operando 1
	 * @param b Operando 2
	 * @return el resultado de la multiplicacion de los dos parametros
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Realiza la división de los dos parametros entregados
	 * @param a Operando 1
	 * @param b Operando 2
	 * @return el resultado de la division de los parametros
	 * @exception ArithmeticException en caso de que el segundo parametro sea 0
	 *
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/**
	 * Multiplica un numero por todos los que haya desde 0 hasta llegar a otro numero introducido
	 * @param a numero a multiplicar
	 * @param n numero hasta el que multiplicar
	 * @return el resultado de todas las multiplicaciones
	 */
	public int productoFactorial ( int a , int n ){

	    int resultado = 1;

	    for ( int i = 0; i < n ; i++ ){
	        resultado = resultado * a;
	    }

	    return resultado; 

	}
	
	/**
	 * Te dice si un numero es par
	 * @param a parametro a analizar
	 * @return true si es par, false si es impar
	 */
	public boolean esPar ( int a ){

	    boolean esPar;

	    if ( a % 2 == 0) {
	        esPar = true;
	    } else {
	        esPar = false;
	    }

	    return esPar;

	}
	
	/**
	 * Realiza divisiones hasta que el numero sea 0, para obtener la representación binaria del número
	 * 
	 * @param a numero a convertir
	 * @return el resultado de todas las divisiones
	 */
	public String dividirHastaCero(int a){

	    String resultado = "";
	    int v = a;
	    int v1;

	    while ( v > 0) {

	        v1 = v % 2;

	        resultado = v1 + resultado;

	        v = v / 2;


	    }
	    return resultado;
	}
	
}
