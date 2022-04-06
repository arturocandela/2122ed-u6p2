package ed.diego;

/**
 * Esto es una calculadora con diferentes opciones de calculo
 * <p>
 * La clase tiene diferentes métodos para realizar todas las opciones de
 * cálculo. ( Más descripción, la larga )
 * 
 * @author Diego Matarredona Sancho
 * @version 2.5
 * @since 1.9, julio de 2019
 */
public class Calculadora {
	
	/**
	 * Suma el primer numero con el segundo
	 * 
	 * @param a primero numero
	 * @param b segundo numero
	 * @return la suma de los dos números
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Resta el segundo numero al primero
	 * @param a primero numero
	 * @param b segundo numero
	 * @return el resultado de la resta
	 * @exception java.lang.ArithmeticException Salta cuando hay un error de calculo
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplica el primero numero por el segundo
	 * 
	 * @param a primero numero
	 * @param b segundo numero
	 * @return el resultado de la multiplicacion
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Divide el primer numero entre el segundo
	 * 
	 * @param a primero numero
	 * @param b segundo numero
	 * @return el resultado de la division 
	 * @exception java.lang.ArithmeticException Salta cuando b es 0.
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
