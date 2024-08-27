public class CaixaEletronica {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitiado = 26.0;

        if(valorSolicitiado < saldo) {
            saldo = saldo - valorSolicitiado;
        System.out.println(saldo);
        }
        else {
            System.out.println("Saldo insuficiente.");
        }
        
    }
}
