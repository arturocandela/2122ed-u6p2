package ed.rachel;

/**
 * Clase Calculadora. Se utilizan metodos para realizar operaciones.
 * 
 * Mediante dos atricutos de tipo entero se realizan cuatro tipos de operaciones, suma, resta, multiplicacion y division.
 * 
 * 
 * @author Rachel Samaniego Gisbert
 * @version 2.5
 * @since version 1.9 of june 2019
 * 
 * */

public class Calculadora {
	/**
	 * Se suma dos enteros
	 * @param a, entero
	 * @param b, entero
	 * @return suma de a y b, entero
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * Se resta dos enteros
	 * @param a, entero
	 * @param b, entero
	 * @return resta de a y b, entero, puede ser un numero negativo
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Se multiplica dos enteros
	 * @param a, entero
	 * @param b, entero
	 * @return multiplicacion de a y b, entero
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * Se divide dos enteros
	 * @param a, entero
	 * @param b, entero
	 * @return division de a y b, entero
	 * @exception ArithmeticException Cuando se intenta dividir entre 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	
	/**
	 * Calculo de potencia, un entero es elevado a otro entero
	 * @param base, entero el cual se multiplica
	 * @param exponente, numero de veces que base se multiplica
	 * @return entero
	 */
	public int potencia(int base , int exponente){
	    int resultado = 1;

	    for ( int i = 0; i < exponente ; i++ ){
	        resultado = resultado * base;
	    }

	    return resultado; 
	}

	/**
	 * Se calcula si un numero es par si es divisible entre 2 y resulta 0
	 * @param a, entero el cual se comprueba si es par
	 * @return true si es par, false si es impar
	 */
	public boolean esPar(int a){
	    boolean esPar;

	    if ( a % 2 == 0) {
	        esPar = true;
	    } else {
	        esPar = false;
	    }

	    return esPar;
	}

	/**
	 * Sacar los numeros del que tenemos en el atributo
	 *
	 * @param a, entero
	 * @return lista de numeros
	 */
	public String getNumeros(int a){
	    String texto = "";
	    int copiaNumero = a;
	    int numPequenyo;

	    while ( copiaNumero > 0) {

	        numPequenyo = copiaNumero % 2;
	        texto = numPequenyo + texto;
	        copiaNumero = copiaNumero / 2;

	    }
	    return texto;
	}
}