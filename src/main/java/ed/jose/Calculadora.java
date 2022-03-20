package ed.jose;

/**
 * Realiza diferentes operaciones con los números que se le pasen como parámetro
 * <p>
 * Esta clase parte de los requisitos de la actividad 2 de la práctica 2. En esta clase vemos diferentes operaciones que puede realizar una calculadora, nosotros le pasaremos los operandos como parametros y le diremos que operación queremos realizar. 
 * @author Jose Soriano Castro
 * @version 2.5
 * @version disponible desde la 1.9
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
	 * @exception si divides por 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
