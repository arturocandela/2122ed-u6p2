package ed.antoni;
/**
 * La clase realiza las operaciones propias de una calculadora
 * 
 * Mediante los métodos, devuelve sumar,restar,multiplicar, o dividir 2 numeros enteros ... falta información...
 * 
 * En la misma descripción, indicar que se since, se ha de colocar en el formato que se detalla.
 * 
 * @author Antoni Medina Sanjuan
 * @version 2.5
 * @since 1.9, junio de 2019
 */
public class Calculadora {
	
	/**
	 * Falta la descripción del método y la excepción colocada es errónea.
	 * 
	 * @param a numero entero 1
	 * @param b numero entero 2
	 * @return el total de la suma de los dos números enteros
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * Falta la descripción del método
	 * 
	 * @param a numero entero 1
	 * @param b numero entero 2
	 * @return el total de la resta de los dos numeros enteros	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Falta la descripción del método
	 * 
	 * @param a numero entero 1
	 * @param b numero entero 2
	 * @return el total de la multiplicación de los dos numeros enteros
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * Falta la descripción
	 * 
	 * @param a numero entero 1
	 * @param b numero entero 2
	 * @return el total de la división de los dos numeros enteros
	 * @exception ArithmeticException en el caso de que	b sea 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/** 
	 * Falta la descripción
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
	 * Falta la descripción
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
	 * Falta la descripción
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
