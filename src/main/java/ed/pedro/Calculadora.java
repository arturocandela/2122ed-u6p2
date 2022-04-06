package ed.pedro;

/**
 * Esta clase sirve para realizar cálculos matemáticos
 * <p>
 * La clase a continuación tiene como principal finalidad la realización de
 * cálculos matemáticos de naturaleza simple, tales como suma, resta,
 * multiplicación y división. Para el uso de los métodos és necesario
 * proporcionar los parámetros de a y b, que vienen a representar los números
 * con los que queremos realizar la operación.
 * 
 * @author Pedro Luis Bruzual Puerta
 * @version 2.5
 * @since 1.9, july 2019
 * 
 */

public class Calculadora {

	/**
	 * Éste método devuelve la suma de a y b
	 * 
	 * @param a sumando
	 * @param b sumando
	 * @return suma
	 */
	public int suma(int a, int b) {

		return a + b;
	}

	/**
	 * Éste método devuelve la resta de a y b
	 * 
	 * @param a minuendo
	 * @param b sustraendo
	 * @return diferencia
	 */
	public int resta(int a, int b) {

		return a - b;
	}

	/**
	 * Éste método devuelve la multiplicación de a por b
	 * 
	 * @param a multiplicando
	 * @param b multiplicador
	 * @return producto de a por b
	 *
	 */
	public int multiplica(int a, int b) {

		return a * b;
	}

	/**
	 * Éste método devuelve la división de a entre b
	 * 
	 * @param a dividendo
	 * @param b divisor
	 * @return cociente de a entre b
	 * @exception ArithmeticException si b es 0
	 */
	public int diveix(int a, int b) {

		return a / b;
	}

	/**
	 * Éste método devuelve el productorio de a
	 * 
	 * @param a número a multiplicar
	 * @param n número de veces que queremos multiplicar
	 * @return productorio de a
	 */
	public int productorio(int a, int n) {

		int t = 1;

		for (int i = 0; i < n; i++) {
			t = t * a;
		}

		return t;

	}

	/**
	 * 
	 * Este método devuelve si un número es primo o no
	 * 
	 * @param a numero a verificar
	 * @return true si el número es primo, false en caso contrario
	 * 
	 */
	public boolean elNumeroEsPrimo(int a) {

		boolean esPrimo;

		if (a % 2 == 0) {
			esPrimo = true;
		} else {
			esPrimo = false;
		}

		return esPrimo;
	}

	public String oper3(int a) {

		String r = "";
		int v = a;
		int v1;

		while (v > 0) {

			v1 = v % 2;

			r = v1 + r;

			v = v / 2;

		}

		return r;

	}

}
