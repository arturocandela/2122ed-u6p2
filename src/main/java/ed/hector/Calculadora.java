package ed.hector;
/**
 * Esta clase permite realizar operaciones
 * <p>
 * Esta clase permite realizar un total de cuatro operaciones distintas. Las cuales son:
 * Suma, resta, multiplicacion y division
 * </p>
 * @author Hector Valls
 * @version 2.5 (version actual)
 * @since 1.9 (primera version creada el 19 de junio de 2019)
 */
public class Calculadora {
	
	/**
	 * Metodo que suma dos valores recibidos como parametro
	 * @param a Primer valor de la suma
	 * @param b Segundo valor de la suma
	 * @return Resultado de dicha suma
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Metodo que resta dos valores recibidos como parametro
	 * @param a Primer valor de la resta
	 * @param b Segundo valor de la resta
	 * @return Resultado de dicha resta
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	
	/**
	 * Metodo que multiplica dos valores recibidos como parametro
	 * @param a Primer valor de la multiplicacion
	 * @param b Segundo valor de la multiplicacion
	 * @return Resultado de dicha multiplicacion
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	
	/**
	 * Metodo que divide dos valores recibidos como parametro
	 * @param a Primer valor de la division
	 * @param b Segundo valor de la division
	 * @return Resultado de dicha division
	 * @throws ArithmeticException Al dividir por cero
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/**
	 * Metodo que devuelve un numero elevado n numero de veces 
	 * @param a numero a elevar
	 * @param n numero de veces a elevar
	 * @return t (resultado de la elevacion)
	 */
	public int oper1 (int a, int n) {
		int t = 1;
		for (int i = 0; i<n; i++) {
			t = t * a;
		}
		return t;
	}
	
	
	/**
	 * Dice si un numero en par
	 * @param a numero a comprobar
	 * @return Resultado de la comprobacion
	 */
	public boolean esPar ( int a ){
	    boolean r;

	    if ( a % 2 == 0) {
	        r = true;
	    } else {
	        r = false;
	    }

	    return r;

	}
	
	/**
	 * Recoge en forma de cadena todos los restos de las operaciones
	 * <p>
	 * Divide un numero entre dos, y concatena los restos en una String
	 * @param a numero con el que se trabajara
	 * @return r String de restos
	 */
	public String obtenerStringRestos(int a){

	    String r = "";
	    int v = a;
	    int v1;

	    while ( v > 0) {

	        v1 = v % 2;

	        r = v1 + r;

	        v = v / 2;
	    }
	    return r;

	}
}


