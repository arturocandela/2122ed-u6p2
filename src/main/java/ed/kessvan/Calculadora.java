package ed.kessvan;

/**
 * Calculadora de càlculs aritmètics
 * 
 * Aquesta clase permet calcular operacions aritmètiques
 * (suma, resta, multiplicació, divisió) amb dues nombres enters.
 * 
 * @author Kessvan Cedeño
 * @version 2.5
 * @since 1.9 Juny 2019
 * 
 */
public class Calculadora {
	
	/**
	 * Mètode per a sumar dues nombres enters
	 * 
	 * @param Primer nombre
	 * @param Segon nombre
	 * @return Suma dels sumants
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Mètode per a restar dues nombres enters
	 * 
	 * @param Primer nombre
	 * @param Segon nombre
	 * @return El primer nombre menys el segon
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Mètode per a multiplicar dues nombres enters
	 * 
	 * @param Primer multiplicant
	 * @param Segon multiplicant
	 * @return Producte dels multiplicants
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Mètode per a dividir dues nombre enters
	 * 
	 * @param Dividendo
	 * @param Divisor
	 * @return Cociente
	 * @throws ArithmeticException si el divisor es 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
