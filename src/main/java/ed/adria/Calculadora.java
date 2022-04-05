package ed.adria;

/**
 * 
 *  This class groups various methods corresponding
 *  a simple calculator
 *  <p>
 *	This class is a part of the project "Calculadora" which is indeed 
 *	a simple calculator with the basic operations such as: 
 * <ul>
 *		<li>Addition (+)</li>
 *		<li>Substraction (-)</li>
 *		<li>Multiplication (*)</li>
 *		<li>Division (/)</li>
 *		<li>Modulus (%)</li>
 *		<li>Power (^)</li>
 * </ul>
 * 
 * @author Adrià Jordà Martínez
 * @version 2.5
 * @since 1.5, 2015-06-01
 * 
 */
public class Calculadora {
	/**
	 * This method adds two numbers
	 * 
	 * @param a first number
	 * @param b second number
	 * @return Integer of the sum of the two numbers
	 * 
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * This method Extracts the second parameter over the first one
	 *
	 * @param a Integer of first number
	 * @param b Integer of second number
	 * @return extraction of both numbers entered as parameters
	 * 
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * This method multiplies two numbers
	 * 
	 * @param a Integer of first number
	 * @param b Integer of second number
	 * @return multiplication of both numbers entered as parameters
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * This method divides the first parameter by the second
	 * 
	 * @param a Integer of first number
	 * @param b Integer of second number
	 * @return returns the division of both parameters
	 * @throws ArithmeticException if the second parameter is 0
	 * 
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}
	
	/**
	 * This method calculates the power of the first number enter elevated to the second number entered
	 * 
	 * @param number Integer number
	 * @param numberOfTimes Integer
	 * @return power of the first number entered elevated to the second number entered
	 * 
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
	 * This method calculates the remainder of the first number divided by the second number
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
	 * @return restList String List of all remainders when the number introduces is divided between two
	 * 
	 * Obtains a list in a String with all the remainders on the number when you diveded between two
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
