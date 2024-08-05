package operadores;

public class OperadorTernario {
	public static void main(String[] args) {
		int a,b;
		
		a = 5;
		b = 6;
		
		// operador ternario pode otimizar o uso de if simples
		String resultado = a==b ?"verdadeiro" : "falso";
		
		System.out.println(resultado);
		
	}
}
