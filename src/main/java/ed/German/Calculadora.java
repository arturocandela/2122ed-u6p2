/**
 * Classe Calculadora -> Realitza opeacions matemàtiques
 * 
 * Aquesta clase té la utilitat de rebre 2 números, i depenent de l'operació sel.leccionada, retornarà
 * el valor corrsponent amb l'operació.
 * @author Germán
 * @version 2.5
 * @since 1.9 juny 2019
 */

package ed.German;

public class Calculadora {
	/**
	 * Reb 2 números per a realitzar la seua suma entre ells.
	 * @param a primer sumand.
	 * @param b segon sumand.
	 * @return la suma dels 2 números.
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * Reb 2 números per a realitzar la seua resta entre ells.
	 * @param a minuend de la resta.
	 * @param b substrend de la resta.
	 * @return la resta dels 2 números.
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Reb 2 números per a realitzar la seua multiplicació entre ells.
	 * @param a multiplicant.
	 * @param b multiplicador.
	 * @return el producte de la multiplicació.
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * Reb 2 números per a realitzar la seua divisió entre ells.
	 * @param a divident.
	 * @param b divisor.
	 * @return el quocient de la divisió.
	 * @throws @Exception ArithmeticException llança la excepció si intentem dividir entre 0.
	 */
	public int diveix(int a, int b) throws ArithmeticException{
		if(b == 0) {
			throw new ArithmeticException();
		}
		return a/b;
	}
	
}
