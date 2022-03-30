package ed.antoni;
/**
 * La clase Calculadora devuelve el resultado al sumar,restar,
 * multiplicar o dividir 2 numeros enteros
 * @author Antoni Medina Sanjuan
 * @version 2.5
 * Disponible desde la versión 1.9, junio de 2019
 */
public class Calculadora {
	
	/**
	 * 
	 * @param a numero entero 1
	 * @param b numero entero 2
	 * @return el total de la suma de los dos numeros enteros
	 * @exception java.lang.ArithmeticException Error, debe de ser entero
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * 
	 * @param a numero entero 1
	 * @param b numero entero 2
	 * @return el total de la resta de los dos numeros enteros
	 * @exception java.lang.ArithmeticException Error, debe de ser entero
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * 
	 * @param a numero entero 1
	 * @param b numero entero 2
	 * @return el total de la multiplicación de los dos numeros enteros
	 * @exception java.lang.ArithmeticException Error, debe de ser entero
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * 
	 * @param a numero entero 1
	 * @param b numero entero 2
	 * @return el total de la división de los dos numeros enteros
	 * @exception java.lang.ArithmeticException Error, debe de ser entero y no debe de ser una division entre 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/**
	 * 
	 * @param base de la potencia, se multiplica por sí mismo tantas veces como indique el otro numero llamado exponente 
	 * @param exponente es el numero que indica las veces que la base se multiplicará por sí mismo
	 * @return el resultado de la potencia
	 */
	public int calculaPotencia ( int base , int exponente ){

	    int totalPotencia = 1;

	    for ( int i = 0; i < exponente ; i++ ){
	        totalPotencia = totalPotencia * base;
	    }

	    return totalPotencia; 

	}
	
	/**
	 * 
	 * @param numero que comprobaremos si es par o impar
	 * @return true si es par, false si es impar
	 */
	public boolean esPar ( int numero ){

	    boolean esPar;

	    if ( numero % 2 == 0) {
	        esPar = true;
	    } else {
	        esPar = false;
	    }

	    return esPar;

	}
	/**
	 * 
	 * @param entero al que convertiremos en numero binario
	 * @return el entero pasado a binario
	 */
	public String conversorABinari(int entero){

	    String resultatBinari = "";
	    int numeroEntero = entero;
	    int resto;

	    while ( numeroEntero > 0) {

	        resto = numeroEntero % 2;

	        resultatBinari = resto + resultatBinari;

	        numeroEntero = numeroEntero / 2;

	    }
	    return resultatBinari;

	}
	
}
