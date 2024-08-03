package typevariables;

public class TiposVariaveis {
	public static void main(String[] args) {
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numerocurto2 = (short) numeroNormal;

		int numero = 1;

		numero = 5;
		numero = 10;
		
		System.out.println(numero);
		
		final double VALOR_DE_PI = 3.14;
		VALOR_DE_PI =11;
		//final não pode ser modificiada
		
	}
}
