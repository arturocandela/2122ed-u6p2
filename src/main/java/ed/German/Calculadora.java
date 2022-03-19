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
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	public int resta(int a, int b) {
		return a - b;
	}
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
