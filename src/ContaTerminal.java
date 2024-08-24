import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente = "Leonardo Ribeiro";
        double saldo = 0.50;

        System.out.println("Qual é o numero da sua conta ?");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Qual é a sua Agência ?");
        agencia = scanner2.nextLine();
        
        System.out.println("Olá " + nomeCliente +
         " Obrigado por criar uma conta em nosso banco, sua agência: "
          + agencia + ", conta: " + numero + " e seu saldo: " + saldo + "R$ " +"ja está disponivel para saque.");

    }
}
