package operadores;

public class Operadores {
	public static void main(String[] args) {
		String nomeCompleto = "LINGUAGEM" + "JAVA";
		System.out.println(nomeCompleto);
		
		String concatenacao ="?";
		
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao); //resultado 31
		
		concatenacao = 1+1+"1"+1;
		System.out.println(concatenacao);  //resultado 211
		
		concatenacao ="1"+ (1+1+1);
		System.out.println(concatenacao); //resultado 13
		
		int numero = 5;
		
		numero =- numero;
		System.out.println(numero);
		
		numero =+ numero;
		System.out.println(numero);
		
		numero =  numero * 1;
		System.out.println(numero);
		
		numero =  numero * -1;
		System.out.println(numero);
		
		numero =  numero * 1;
		System.out.println(numero);
		
		//as vezes é preciso fazer calculos na logica da matematica para conseguir resultados esperados.
		
		
		
	}
}
