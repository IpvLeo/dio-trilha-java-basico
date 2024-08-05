package operadores;

public class OperadorRelacionais {
	public static void main(String[] args) {
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		simNao = numero1 != numero2;
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		String numero = numero1 > numero2? "0" : "1";
		System.out.println("numeroUm é maior que numeroDois? resposta com binario: " + numero);
		
		
		String nomeUm = "Leonardo";
		String nomeDois = "Leonardo ";
		//Objetos e textos usa o metodo equals
		System.out.println(nomeUm.equals(nomeDois));
	}
}
