package ed.kessvan;

/**
 * Calculadora de càlculs aritmètics
 * <p>
 * Aquesta clase permet calcular operacions aritmètiques
 * (suma, resta, multiplicació, divisió) amb dues nombres enters.
 * 
 * @author Kessvan Cedeño
 * @version 2.5
 * @since 1.9, Juny 2019
 * 
 */
public class Calculadora {
	
	/**
	 * Mètode per a sumar dues nombres enters
	 * 
	 * @param a Primer nombre
	 * @param b Segon nombre
	 * @return Suma dels sumants
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Mètode per a restar dues nombres enters
	 * 
	 * @param a Primer nombre
	 * @param b Segon nombre
	 * @return El primer nombre menys el segon
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Mètode per a multiplicar dues nombres enters
	 * 
	 * @param a Primer multiplicant
	 * @param b Segon multiplicant
	 * @return Producte dels multiplicants
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Mètode per a dividir dues nombre enters
	 * 
	 * @param a Dividendo
	 * @param b Divisor
	 * @return Cociente
	 * @throws ArithmeticException si el divisor es 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/**
	 * Mètode que eleva un nombre n vegades
	 * 
	 * @param base Nombre que es multiplica
	 * @param exponent Nombre de vegades que es multiplica la base
	 * @return La base elevado al exponente
	 */
	public int exponer(int base , int exponent){
	    int resultat = 1;
	    for ( int i = 0; i < exponent ; i++ ){
	        resultat = resultat * base;
	    }
	    return resultat; 
	}

	/**
	 * Mètode que comprova si un nombre es parell
	 * 
	 * @param a Nombre a comprovar
	 * @return true si el nombre es parell, false en cas contrari
	 */
	public boolean esParell(int a){
	    return a % 2 == 0;
	}

	/**
	 * Mètode que retorne el codi binari d'un nombre
	 * 
	 * @param a Nombre enter
	 * @return Codi binari generat
	 */
	public String toBinary(int a){
	    String codiBinari = "";
	    int aux = a;
	    int aux2;

	    while (aux > 0) {
	        aux2 = aux % 2;
	        codiBinari += aux2;
	        aux /= 2;
	    }
	    
	    return codiBinari;	    
	}
}
