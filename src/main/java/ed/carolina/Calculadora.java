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

package ed.carolina;

public class Calculadora {
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	public int resta(int a, int b) {
		return a - b;
	}
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
