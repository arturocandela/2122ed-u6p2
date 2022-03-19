package ed.miguel;

public class TestCalculador {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.suma(45,25));
		System.out.println(calculadora.resta(45,25));
		System.out.println(calculadora.multiplica(45,25));
		System.out.println(calculadora.diveix(25,5));
		System.out.println(calculadora.potencia(2, 2));
		System.out.println(calculadora.esPar(28));
		System.out.println(calculadora.enteroABinario(10));
	}

}
