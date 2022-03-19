package ed.sergi;

/**
 * Fa càlcus amb els paràmetres rebuts
 * <p>
 * Aquesta classe actua com a calculadora i permet retornar el
 *  resultat dels paràmetres rebuts a diversos tipus de càlculs
 * </p>
 * @author Sergi Payà
 * @version 2.5
 * @since 1.9, juny de 2019
 *
 */
public class Calculadora {
	
	/**
	 * 
	 * Reb 2 paràmetres i els suma
	 * @param a primer sumand
	 * @param b segon sumand
	 * @return Retorna la suma de a i b
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Reb 2 parametres i els resta
	 * @param a valor inicial
	 * @param b valor a restar
	 * @return Retorna la resta de a - b
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Reb 2 parametres i els multiplica
	 * @param a multiplicand
	 * @param b multiplicador
	 * @return Retorna la multiplicacio de a * b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Reb dos parametres y els divideix
	 * @param a dividend
	 * @param b divisor
	 * @return Retorna el resultat de a / b
	 * @exception ArithmeticException Si el divisor es 0 no es podra fer la divisio
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/**
	 * Eleva un numero N vegades
	 * @param num numero que elevar
	 * @param pot potencia a la que s'eleva
	 * @return resultat d'elevar num^pot
	 */
	public int potencia ( int num , int pot ){

	    int total = 1;

	    for ( int i = 0; i < pot ; i++ ){
	        total = total * num;
	    }

	    return total; 

	}

	/**
	 * Reb un numero i respon si es par o no
	 * @param num numero a comprovar
	 * @return retorna true si num es par i false si no ho es
	 */
	public boolean isPar ( int num ){

	    boolean isPar;

	    if ( num % 2 == 0) {
	        isPar = true;
	    } else {
	        isPar = false;
	    }

	    return isPar;

	}

	/**
	 * Obte un string amb una serie de restos del numero
	 * @param num numero del que obtindre els restos
	 * @return String amb una seqüencia de restos de tantes voltes com num es puga dividir entre 2
	 */
	public String cadenaRestos(int num){

	    String resultat = "";
	    int numero = num;
	    int resto;

	    while ( numero > 0) {

	        resto = numero % 2;

	        resultat = resto + resultat;

	        numero = numero / 2;


	    }
	   
	    return resultat;
	    
	}
	
}
