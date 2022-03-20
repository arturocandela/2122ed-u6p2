package ed.ruben;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		for(int i = 0;  i < 32; i++) {
			System.out.println(i + " ->" + calculadora.pasarABinario(i));
		}
	}

}
