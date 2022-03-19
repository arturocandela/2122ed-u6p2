package ed.iker;

/**
 * Esta clase serveix per a realitzar diferents calculs, com la suma, la resta,
 * la multiplicació i la divisio dels nombres passats per argument. Es requereixen 
 * nombres enters
 * @author iker
 * @version 2.5
 * @since 1.9, juny de 2019
 */

public class Calculadora {
	/**
	 * @param a primer enter
	 * @param b segon enter
	 * @return Retorna la suma dels dos numeros passats per argument
	 * @throws java.util.NoSuchElementException llança error si aquest no te elements passats per argument
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * @param a primer enter
	 * @param b segon enter
	 * @return Retorna la resta dels dos numeros passats per argument
	 * @throws java.util.NoSuchElementException llança error si aquest no te elements passats per argument
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * @param a primer enter
	 * @param b segon enter
	 * @return Retorna la multiplicacio dels dos numeros passats per argument
	 * @throws java.util.NoSuchElementException llança error si aquest no te elements passats per argument
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * @param a primer enter
	 * @param b segon enter
	 * @return Retorna la divisio dels dos numeros passats per argument
	 * @throws java.util.NoSuchElementException llança error si aquest no te elements passats per argument
	 * @throws ArithmeticException si el numero és dividit entre 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	public int oper1 ( int a , int n ){

	    int t = 1;

	    for ( int i = 0; i < n ; i++ ){
	        t = t * a;
	    }

	    return t; 

	}

	public boolean oper2 ( int a ){

	    boolean r;

	    if ( a % 2 == 0) {
	        r = true;
	    } else {
	        r = false;
	    }

	    return r;

	}

	
	/*
	public String oper3(int a){

	    String r = "";
	    int v = a;
	    int v1;

	    while ( v > 0) {

	        v1 = v % 2;

	        r = v1 + r;

	        v = v / 2;


	    }

	}
	*/
	
}
