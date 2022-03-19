package ed.adria;

/**
 * 
 * @author AdriaJ
 * @version 2.5
 * @since 1.2
 *This class groups various methods corresponding
 *a simple calculator
 *
 */
public class Calculadora {
	/**
	 * 
	 * @param a Integer of first number
	 * @param b Integer of second number
	 * @return a+b
	 * returns the sum of both numbers
	 * 
	 * This class returns the sum of both parameters
	 * 
	 * The methods of this calculator are the sum of two numbers,
	 * the extraction of two numbers, the multiplication of two numbers
	 * and the division of two numbers
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * 
	 *  @param a Integer of first number
	 * @param b Integer of second number
	 * @return a-b
	 * returns extraction of both numbers 
	 * entered as parameters
	 * Extracts the second parameter over the first
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * 
	 *  @param a Integer of first number
	 * @param b Integer of second number
	 * @return a*b return the multiplication of both parameters
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * 
	 *  @param a Integer of first number
	 * @param b Integer of second number
	 * @return a/b
	 * returns the division of the 
	 * first parameter over the second
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/**
	 * 
	 * @param number Integer number
	 * @param Integer numberOfTimesMulyplicated
	 * @return Power of number elevated to numberOfTimes
	 * returns the power of the first number enter elevated to the second number entered
	 */
	public int oper1 ( int number , int numberOfTimes ){

	    int total = 1;

	    for ( int i = 0; i < numberOfTimes ; i++ ){
	        total = total * number;
	    }
	    return total; 

	}

	/**
	 * 
	 * @param number Integer that will be check if is pair
	 * @return boolean True if the number is pair, and false if it is not
	 * Returns true if the number is pair and false if it is not
	 */
	public boolean oper2 ( int number ){

	    boolean isPair;

	    if ( number % 2 == 0) {
	        isPair = true;
	    } else {
	        isPair = false;
	    }

	    return isPair;
	}
	
	/**
	 * 
	 * @param number Integer number which will obtain the list of remainders
	 * @return String List of all remainders
	 */
	public String oper3(int number){

	    String restList = "";
	    int numberToOperate = number;
	    int rest;

	    while ( numberToOperate > 0) {

	        rest = numberToOperate % 2;

	        restList = rest + restList;

	        numberToOperate = numberToOperate / 2;

	    }
	    return restList;

	}
}
